package ast;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.SimpLanPlusParser.BodyContext;
import parser.SimpLanPlusParser.DecContext;
import parser.SimpLanPlusParser.ExpContext;
import parser.SimpLanPlusParser.FunExpContext;
import parser.SimpLanPlusParser.ParamContext;
import parser.SimpLanPlusParser.ProgContext;
import parser.SimpLanPlusParser.StmContext;
import parser.SimpLanPlusParser.TypeContext;
import parser.SimpLanPlusParser.VarExpContext;
import parser.SimpLanPlusVisitor;
import parser.SimpLanPlusParser.IntValContext;


public class SimpLanPlusVisitorImpl implements SimpLanPlusVisitor<Node>{

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
	public Node visitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDec(DecContext ctx) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStm(StmContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExp(ExpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public Node visitIntVal(IntValContext ctx) {
		// notice that this method is not actually a rule but a named production #intVal		
		//there is no need to perform a check here, the lexer ensures this text is an int
		return new IntNode(Integer.parseInt(ctx.INTEGER().getText()));
	}
	
	
	public Node visitVarExp(VarExpContext ctx) {		
		//this corresponds to a variable access
		return new IdNode(ctx.ID().getText());
	}
	
	public Node visitFunExp(FunExpContext ctx) {
		//this corresponds to a function invocation
		//declare the result
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
	

}
