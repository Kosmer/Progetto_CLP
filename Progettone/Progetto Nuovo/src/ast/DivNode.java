package ast;

import java.util.ArrayList;

import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class DivNode implements Node {
	 private Node left;
	 private Node right;
	  
	 public DivNode (Node _left, Node _right) {
	    left = _left ;
	    right = _right;
	 }
	  
	 public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		  ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		  
		  errors.addAll(left.checkSemantics(ST, _nesting));
		  errors.addAll(right.checkSemantics(ST, _nesting));
		  
	 	  return errors;
	 	}
	  
	  public Type typeCheck() {
		  if ((left.typeCheck() instanceof IntType) && (right.typeCheck() instanceof IntType) ) 
			  return new IntType() ;
		  else {
			  System.out.println("Type Error: Non integers in multiplication") ;
			  return new ErrorType() ;
		  }	  
	  }
	  
	  
	  public String codeGeneration() {
		  /*
		   * DA RIFARE
		   * 
			return 		left.codeGeneration()
					   + "pushr A0 \n"
					   + right.codeGeneration()
					   + "popr T1 \n" 
					   + "sub T1 A0 \n" 
					   + "popr A0 \n";
			*/
		  //MOMENTANEA, TOGLIERE
		  return " ";
	  }
	  
	  
	  public String toPrint(String s) {
		    return s+"Div\n" + left.toPrint(s+"  ")  + right.toPrint(s+"  ") ; 
	  }
		  
  
}