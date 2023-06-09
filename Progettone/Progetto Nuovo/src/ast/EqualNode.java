package ast;

import java.util.ArrayList;

import evaluator.SimpLanPluslib;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class EqualNode implements Node {
	private Node left;
	private Node right;
  
	public EqualNode (Node _left, Node _right) {
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
		  if ((left.typeCheck() instanceof BoolType) && (right.typeCheck() instanceof BoolType) ) 
			  return new BoolType() ;
		  System.out.println("Type Error: Different types in addition") ;
		  return new ErrorType() ;
	}
	  
  
	public String codeGeneration() {
		String ltrue = SimpLanPluslib.freshLabel(); 
		String lend = SimpLanPluslib.freshLabel();
		return	//"EQUALNODE\n"+
				left.codeGeneration()+
				"pushr A0 \n" +
				right.codeGeneration()+
				"popr T1 \n" +
				"beq A0 T1 "+ ltrue +"\n"+
				"storei A0 0\n"+
				"b " + lend + "\n" +
				ltrue + ":\n"+
				"storei A0 1\n" +
				lend + ":\n";
				//+"FINE EQUALNODE\n";	
	}
   
	public String toPrint(String s) {
	    return s+"Equal\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ; 
	}
	  
}  