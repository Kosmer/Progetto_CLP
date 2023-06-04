package ast;

import java.util.ArrayList;

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
		/*
		 * DA RIFARE
		 *
		return left.codeGeneration()+
			   "pushr A0 \n" +
			   right.codeGeneration()+
			   "popr T1 \n" +
			   "add A0 T1 \n" +
			   "popr A0 \n" ;
		*/
		return "";
	}
   
	public String toPrint(String s) {
	    return s+"Not\n" + ctx.toPrint(s+"  ") ; 
	}
	  
}  