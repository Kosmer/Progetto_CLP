package ast;

import java.util.ArrayList;

import evaluator.SimpLanlib;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class LesserEqualsNode implements Node {
	private Node left;
	private Node right;
  
	public LesserEqualsNode (Node _left, Node _right) {
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
		  if ((left.typeCheck() instanceof IntType) && (right.typeCheck() instanceof IntType) ) 
			  return new BoolType() ;
		  else {
			  System.out.println("Type Error: Non integers in addition") ;
			  return new ErrorType() ;
		  }
	}  
  
	public String codeGeneration() {
		String ltrue = SimpLanlib.freshLabel(); 
		String lend = SimpLanlib.freshLabel();
		return	left.codeGeneration()+
				"pushr A0 \n" +
				right.codeGeneration()+
				"popr T1 \n" +
				"bleq A0 T1 "+ ltrue +"\n"+
				"storei A0 0\n"+
				"b " + lend + "\n" +
				ltrue + ":\n"+
				"storei A0 1\n" +
				lend + ":\n";
	}
   
	public String toPrint(String s) {
	    return s+"LesserEquals\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ; 
	}
	  
}  