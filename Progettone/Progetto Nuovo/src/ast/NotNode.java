package ast;

import java.util.ArrayList;

import evaluator.SimpLanPluslib;
import parser.SimpLanPlusParser.ExpContext;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class NotNode implements Node {
	private Node ctx;
  
	public NotNode (Node _ctx) {
		ctx = _ctx;
	}
  

	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		return new ArrayList<SemanticError>();
	}
	  
	public Type typeCheck() {
		  if (ctx.typeCheck() instanceof BoolType) 
			  return new BoolType() ;
		  else {
			  System.out.println("Type Error: Non integers in addition") ;
			  return new ErrorType() ;
		  }
	}  
	  
  
	public String codeGeneration() {
		String lfalse = SimpLanPluslib.freshLabel();
		String lexit = SimpLanPluslib.freshLabel();
		return	ctx.codeGeneration()+
				"storei T1 0 \n"+
				"beq A0 T1 " + lfalse + "\n"+
				"storei A0 0\n" +
				"b " + lexit + "\n"+
				lfalse + ":\n"+
				"storei A0 1\n" +
				lexit + ":\n";
	}
   
	public String toPrint(String s) {
	    return s+"Not\n" + ctx.toPrint(s+"  ") ; 
	}
	  
}  