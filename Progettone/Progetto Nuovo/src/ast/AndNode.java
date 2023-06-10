package ast;

import java.util.ArrayList;

import evaluator.SimpLanPluslib;
import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class AndNode implements Node {
	private Node left;
	private Node right;
  
	public AndNode (Node _left, Node _right) {
		left = _left ;
		right = _right ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		  ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		  
		  
		  errors.addAll(left.checkSemantics(ST, _nesting));
		  errors.addAll(right.checkSemantics(ST, _nesting));
		  
		  return errors;
	}
	  
	public Type typeCheck() {
		  if ((left.typeCheck() instanceof BoolType) && (right.typeCheck() instanceof BoolType) ) 
			  return new BoolType() ;
		  else {
			  System.out.println("Type Error: Non boolean in AND compare") ;
			  return new ErrorType() ;
		  }
	}  
  
	public String codeGeneration() {
		String lexit = SimpLanPluslib.freshLabel();
		System.out.println(lexit);
		return	left.codeGeneration()+
				"storei T1 0 \n"+
				"beq A0 T1 " + lexit + "\n"+
				right.codeGeneration()+
				lexit + ":\n";
	}
   
	public String toPrint(String s) {
	    return s+"And\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ; 
	}
	  
}  