package ast;

import java.util.ArrayList;

import evaluator.SimpLanlib;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class IfExpNode implements Node {
	private Node guard ;
	private Node thenbranch ;
	private Node elsebranch ;
  
	public IfExpNode (Node _guard, Node _thenbranch, Node _elsebranch) {
    	guard = _guard ;
    	thenbranch = _thenbranch ;
    	elsebranch = _elsebranch ;
  }
  
   @Override
  public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
	  ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
	  
	  SymbolTable S1 = ST.copy();
	  SymbolTable S2 = ST.copy();
	  
	  System.out.println(ST.toPrint());
	  errors.addAll(guard.checkSemantics(ST, _nesting));
	  errors.addAll(thenbranch.checkSemantics(S1, _nesting));
	  errors.addAll(elsebranch.checkSemantics(S2, _nesting));
	  System.out.println(ST.toPrint());
	  
	  return errors;
  }
  
	public Type typeCheck() {
		if (guard.typeCheck() instanceof BoolType) {
			Type thenexp = thenbranch.typeCheck() ;
			Type elseexp = elsebranch.typeCheck() ;
			if (thenexp.getClass().equals(elseexp.getClass()))
        		return thenexp;
			else {
        		System.out.println("Type Error: incompatible types in then and else branches");
        		return new ErrorType() ;	
			}
		} else {
			System.out.println("Type Error: non boolean condition in if");
			return new ErrorType() ;
		}   
	}
	
	public Type typeCheck(int a) {
		return typeCheck();
	}
  
  	public String codeGeneration() {
  		/*
  		 * DA RIFARE
  		 * 
  		String lthen = SimpLanlib.freshLabel(); 
  		String lend = SimpLanlib.freshLabel();
  		return guard.codeGeneration() +
			 "storei T1 1 \n" +
			 "beq A0 T1 "+ lthen + "\n" +			  
			 elsebranch.codeGeneration() +
			 "b " + lend + "\n" +
			 lthen + ":\n" +
			 thenbranch.codeGeneration() +
	         lend + ":\n" ; 
	    */
  		return "";
  	}

  	public String toPrint(String s) {
	    return s+"If\n" + guard.toPrint(s+"  ") + thenbranch.toPrint(s+"  ")  + elsebranch.toPrint(s+"  ") ; 
	}
	  
}  