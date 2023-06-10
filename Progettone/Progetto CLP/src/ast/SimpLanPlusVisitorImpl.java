package ast;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.SimpLanPlusBaseVisitor;
import parser.SimpLanPlusParser.AddsubExpContext;
import parser.SimpLanPlusParser.AndorExpContext;
import parser.SimpLanPlusParser.BaseExpContext;
import parser.SimpLanPlusParser.BlockseqstmContext;
import parser.SimpLanPlusParser.BlockseqstmexpContext;
import parser.SimpLanPlusParser.BodyContext;
import parser.SimpLanPlusParser.CompareExpContext;
import parser.SimpLanPlusParser.DecstmExpContext;
import parser.SimpLanPlusParser.ExpContext;
import parser.SimpLanPlusParser.FalseExpContext;
import parser.SimpLanPlusParser.FunDecContext;
import parser.SimpLanPlusParser.FunExpContext;
import parser.SimpLanPlusParser.FunStmContext;
import parser.SimpLanPlusParser.IdDecContext;
import parser.SimpLanPlusParser.IfExpContext;
import parser.SimpLanPlusParser.IfStmContext;
import parser.SimpLanPlusParser.IntExpContext;
import parser.SimpLanPlusParser.MuldivExpContext;
import parser.SimpLanPlusParser.NotExpContext;
import parser.SimpLanPlusParser.ParamContext;
import parser.SimpLanPlusParser.SingleExpContext;
import parser.SimpLanPlusParser.StmContext;
import parser.SimpLanPlusParser.TrueExpContext;
import parser.SimpLanPlusParser.TypeContext;
import parser.SimpLanPlusParser.VarExpContext;
import parser.SimpLanPlusParser.VarStmContext;
import parser.SimpLanPlusVisitor;
import parser.SimpLanPlusParser.DecContext;

public class SimpLanPlusVisitorImpl extends SimpLanPlusBaseVisitor<Node> {


	@Override
	public Node visitSingleExp(SingleExpContext ctx) {			//Prog1: singleExp
		return new Prog1Node(visit(ctx.exp()));
	}

	@Override
	public Node visitDecstmExp(DecstmExpContext ctx) {			//Prog2: decstmExp
		
		ArrayList<Node> decList = new ArrayList<Node>();
		ArrayList<Node> stmList = new ArrayList<Node>();
		Node expNode = null;
		
		
		for (DecContext dc : ctx.dec())
			decList.add(visit(dc));
		
		for (StmContext sc : ctx.stm())
			stmList.add(visit(sc));
			
		if(ctx.exp() != null)
			expNode = visit(ctx.exp());
			
		
		return new Prog2Node(decList, stmList, expNode);
	}

	@Override
	public Node visitIdDec(IdDecContext ctx) {					//Dec: idDec
		//visit the type
		Node typeNode = visit(ctx.type());
		
						
		
		return new DecNode(ctx.ID().getText(), typeNode);
	}

	@Override
	public Node visitFunDec(FunDecContext ctx) {				//FunNode:   funDec
		
		ArrayList<ParNode> _param = new ArrayList<ParNode>() ;
				
		for (ParamContext vc : ctx.param())
			_param.add( new ParNode(vc.ID().getText(), (Type) visit( vc.type() )) );
		
		
		ArrayList<Node> innerDec = new ArrayList<Node>();
		ArrayList<Node> innerStm = new ArrayList<Node>();
		Node innerExp = null;
		
		
		if(ctx.body() != null){
			if(ctx.body().dec()!=null) {
				for(DecContext dc : ctx.body().dec())
					innerDec.add(visit(dc));
			}
			if(ctx.body().stm()!=null) {
				for(StmContext sc : ctx.body().stm())
					innerStm.add(visit(sc));
			}
			if(ctx.body().exp()!=null) {
				innerExp = visit(ctx.body().exp()); 
			}
			
			
			
				
		}
		
		
		return new FunNode(ctx.ID().getText(), (Type) visit(ctx.type()), _param, innerDec, innerStm, innerExp);
	}


	@Override
	public Node visitBody(BodyContext ctx) {
		return null;
	}

	@Override
	public Node visitType(TypeContext ctx) {			//type
		if(ctx.getText().equals("int"))
			return new IntType();
		else if(ctx.getText().equals("bool"))
			return new BoolType();
		else return new VoidType();
	}

	@Override
	public Node visitVarStm(VarStmContext ctx) {			//VarStm: assegnamento
		//visit the exp
		Node expNode = visit(ctx.exp());
		
		
		return new VarStmNode(ctx.ID().getText(), expNode);
	}

	@Override
	public Node visitFunStm(FunStmContext ctx) {			//Chiamata di funzione: 		
		Node res;
		
		//get the invocation arguments
		ArrayList<Node> args = new ArrayList<Node>();
		
		for (ExpContext exp : ctx.exp())
			args.add(visit(exp));
		
		
		if(ctx.ID().getText().equals("print"))
			res = new PrintNode(args.get(0));
		
		else
		
			res = new CallNode(ctx.ID().getText(), args);
		
		return res;
	}

	@Override
	public Node visitIfStm(IfStmContext ctx) {				//ifStm
		Node condStm = visit (ctx.cond);
		
		Node thenStm = visit (ctx.thenBranch);
		
		Node elseStm = null;
		if(ctx.elseBranch!=null)
			elseStm = visit (ctx.elseBranch);
		
		return new IfStmNode(condStm, thenStm, elseStm);
	}

	@Override
	public Node visitMuldivExp(MuldivExpContext ctx) {					//moltiplicazione
		if (ctx.mul != null)
			return new MulNode(visit(ctx.left), visit(ctx.right));
		else return new DivNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitAddsubExp(AddsubExpContext ctx) {					//addizione e sottrazione
		if (ctx.plus != null)
			return new PlusNode(visit(ctx.left), visit(ctx.right));
		else return new MinusNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitCompareExp(CompareExpContext ctx) {				//Confronti: ==,<=,<,>,>=
		if(ctx.greater_equals != null){ 
			return new GreaterEqualsNode(visit(ctx.left), visit(ctx.right));
		}
		else if(ctx.lesser_equals != null){ 
			return new LesserEqualsNode(visit(ctx.left), visit(ctx.right));
		}
		else if(ctx.greater!= null){
			return new GreaterNode(visit(ctx.left), visit(ctx.right));
		}
		else if(ctx.lesser!=null){
			return new LesserNode(visit(ctx.left), visit(ctx.right));
		}
		else
			return new EqualNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitVarExp(VarExpContext ctx) {						//id: varExp
		return new IdNode(ctx.ID().getText());
	}

	@Override
	public Node visitTrueExp(TrueExpContext ctx) {						//trueExp
		return new BoolNode(Boolean.parseBoolean("true"));
	}

	@Override
	public Node visitBaseExp(BaseExpContext ctx) {						//baseExp
		return visit (ctx.exp());
	}

	@Override
	public Node visitAndorExp(AndorExpContext ctx) {					//AndOr
		if (ctx.and != null)
			return new AndNode(visit(ctx.left), visit(ctx.right));
		else return new OrNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitIfExp(IfExpContext ctx) {					//IfExp
		Node condExp = visit (ctx.cond);
		
		Node thenExp = visit (ctx.thenBranch);
		
		Node elseExp = visit (ctx.elseBranch);
		
		return new IfExpNode(condExp, thenExp, elseExp);
	}

	@Override
	public Node visitFalseExp(FalseExpContext ctx) {				//FalseExp
		return new BoolNode(Boolean.parseBoolean("false"));
	}

	@Override
	public Node visitFunExp(FunExpContext ctx) {				//Chiamata di funzione: FunExp
		Node res;
		
		//get the invocation arguments
		ArrayList<Node> args = new ArrayList<Node>();
		
		for (ExpContext exp : ctx.exp())
		{
			
			args.add(visit(exp));
		}
			
		
		
		if(ctx.ID().getText().equals("print"))
			res = new PrintNode(args.get(0));
		
		else
			
			res = new CallNode(ctx.ID().getText(), args);
		
		return res;
	}

	@Override
	public Node visitNotExp(NotExpContext ctx) {				//Not
		return new NotNode(visit(ctx.exp()));	
	}

	@Override
	public Node visitIntExp(IntExpContext ctx) {								//intExp
		return new IntNode(Integer.parseInt(ctx.INTEGER().getText()));
	}

	@Override
	public Node visitBlockseqstm(BlockseqstmContext ctx) {					//Blocco rami dell'ifStm
		ArrayList<Node> stmList = new ArrayList<Node>();
		for (StmContext sc : ctx.stm())
			stmList.add(visit(sc));
		
		return new SeqstmNode(stmList);
	}
	

	@Override
	public Node visitBlockseqstmexp(BlockseqstmexpContext ctx) {			//Blocco rami dell'ifExp
		ArrayList<Node> stmList = new ArrayList<Node>();
		Node expNode = null;
		
		for (StmContext sc : ctx.stm())
			stmList.add(visit(sc));
			
		expNode = visit(ctx.exp());
			
		
		return new SeqstmexpNode(stmList, expNode);
	}

}
