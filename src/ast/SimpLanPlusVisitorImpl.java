package ast;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.SimpLanPlusParser.BodyContext;
import parser.SimpLanPlusParser.DecContext;
import parser.SimpLanPlusParser.ExpContext;
import parser.SimpLanPlusParser.ParamContext;
import parser.SimpLanPlusParser.ProgContext;
import parser.SimpLanPlusParser.StmContext;
import parser.SimpLanPlusParser.TypeContext;
import parser.SimpLanPlusVisitor;

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

}
