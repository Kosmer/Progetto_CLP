package ast;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.SimpLanPlusParser.AddsubExpContext;
import parser.SimpLanPlusParser.AndorExpContext;
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
import parser.SimpLanPlusParser.IdInitContext;
import parser.SimpLanPlusParser.IfExpContext;
import parser.SimpLanPlusParser.IfStmContext;
import parser.SimpLanPlusParser.IntExpContext;
import parser.SimpLanPlusParser.MuldivExpContext;
import parser.SimpLanPlusParser.NotExpContext;
import parser.SimpLanPlusParser.ParExpContext;
import parser.SimpLanPlusParser.ParamContext;
import parser.SimpLanPlusParser.SingleExpContext;
import parser.SimpLanPlusParser.TrueExpContext;
import parser.SimpLanPlusParser.TypeContext;
import parser.SimpLanPlusParser.VarExpContext;
import parser.SimpLanPlusParser.VarStmContext;
import parser.SimpLanPlusVisitor;

public class SimpLanPlusVisitorImpl implements SimpLanPlusVisitor<Node> {

	@Override
	public Node visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSingleExp(SingleExpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDecstmExp(DecstmExpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitIdInit(IdInitContext ctx) {
		//visit the type
		Node typeNode = visit(ctx.type());
						
		//build the varNode
		return new DecNode(ctx.ID().getText(), typeNode);
	}

	@Override
	public Node visitFunDec(FunDecContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitParam(ParamContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBody(BodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitType(TypeContext ctx) {
		if(ctx.getText().equals("int"))
			return new IntType();
		else if(ctx.getText().equals("bool"))
			return new BoolType();
		else return new VoidType();
	}

	@Override
	public Node visitVarStm(VarStmContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFunStm(FunStmContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitIfStm(IfStmContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMuldivExp(MuldivExpContext ctx) {
		if (ctx.mul != null)
			return new MulNode(visit(ctx.left), visit(ctx.right));
		else return new DivNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitAddsubExp(AddsubExpContext ctx) {
		if (ctx.plus != null)
			return new PlusNode(visit(ctx.left), visit(ctx.right));
		else return new MinusNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitCompareExp(CompareExpContext ctx) {
		if(ctx.greater_equals != null){ //it is a simple expression
			return new GreaterEqualsNode(visit(ctx.left), visit(ctx.right));
		}
		else if(ctx.lesser_equals != null){ //it is a binary expression, you should visit left and right
			return new LesserEqualsNode(visit(ctx.left), visit(ctx.right));
		}
		else if(ctx.greater!= null){ //it is a binary expression, you should visit left and right
			return new GreaterNode(visit(ctx.left), visit(ctx.right));
		}
		else { //it is a binary expression, you should visit left and right
			return new LesserNode(visit(ctx.left), visit(ctx.right));
		}
	}

	@Override
	public Node visitVarExp(VarExpContext ctx) {
		return new IdNode(ctx.ID().getText());
	}

	@Override
	public Node visitTrueExp(TrueExpContext ctx) {
		return new BoolNode(Boolean.parseBoolean("true"));
	}

	@Override
	public Node visitParExp(ParExpContext ctx) {
		return visit (ctx.exp());
	}

	@Override
	public Node visitAndorExp(AndorExpContext ctx) {
		if (ctx.and != null)
			return new AndNode(visit(ctx.left), visit(ctx.right));
		else return new OrNode(visit(ctx.left), visit(ctx.right));
	}

	@Override
	public Node visitIfExp(IfExpContext ctx) {
		Node condExp = visit (ctx.cond);
		
		Node thenExp = visit (ctx.thenBranch);
		
		Node elseExp = visit (ctx.elseBranch);
		
		return new IfNode(condExp, thenExp, elseExp);
	}

	@Override
	public Node visitFalseExp(FalseExpContext ctx) {
		return new BoolNode(Boolean.parseBoolean("false"));
	}

	@Override
	public Node visitFunExp(FunExpContext ctx) {
		Node res;
		
		//get the invocation arguments
		ArrayList<Node> args = new ArrayList<Node>();
		
		for (ExpContext exp : ctx.exp())
			args.add(visit(exp));
		
		// this is ad-hoc for this project...
		if(ctx.ID().getText().equals("print"))
			res = new PrintNode(args.get(0));
		
		else
			//instantiate the invocation
			res = new CallNode(ctx.ID().getText(), args);
		
		return res;
	}

	@Override
	public Node visitNotExp(NotExpContext ctx) {
		return new NotNode(visit(ctx.exp()));	
	}

	@Override
	public Node visitIntExp(IntExpContext ctx) {
		return new IntNode(Integer.parseInt(ctx.INTEGER().getText()));
	}

	@Override
	public Node visitBlockseqstm(BlockseqstmContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBlockseqstmexp(BlockseqstmexpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
