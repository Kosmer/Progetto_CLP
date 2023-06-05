package ast;

import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanlib;
import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class IfStmNode implements Node {
	private Node guard ;
	private Node thenbranch ;
	private Node elsebranch ;
  
	public IfStmNode (Node _guard, Node _thenbranch, Node _elsebranch) {
    	guard = _guard ;
    	thenbranch = _thenbranch ;
    	elsebranch = _elsebranch ;
  }
  
   @Override
  public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
	  ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
	  
	  SymbolTable S1 = new SymbolTable();
	  S1 = ST.copy();
	  SymbolTable S2 = new SymbolTable();
	  S2 = ST.copy();
	  

	  errors.addAll(guard.checkSemantics(ST, _nesting));
	  errors.addAll(thenbranch.checkSemantics(S1, _nesting));
	  if(elsebranch!=null)
		  errors.addAll(elsebranch.checkSemantics(S2, _nesting));
	  //System.out.println("ST: "+ST.toPrint());
	  //System.out.println("S1: "+S1.toPrint());
	  //System.out.println("S2: "+S2.toPrint());
	  
	  ArrayList<HashMap<String,STentry>> t1 = S1.getSymbolTable();
	  ArrayList<HashMap<String,STentry>> t2 = S2.getSymbolTable();
	  
	  //se nei rami thene else viene inizializzata una variabile allora anche nell'ambiente finale viene inizializzata
	  if(elsebranch!=null) {
		  for(HashMap<String, STentry> h:t1) {
			  for(String key:h.keySet()) {
				  STentry e = ST.lookup(key);
				  STentry e1 = S1.lookup(key);
				  STentry e2 = S2.lookup(key);
				 
				  if(e1.isInitialized() && e2.isInitialized() && !e.isInitialized()) {
					  e.setInitialized();
				  }
			  }
		  }
	  }
	  
	  return errors;
  }
  
	public Type typeCheck() {
		if (guard.typeCheck() instanceof BoolType) {
			
			thenbranch.typeCheck() ;
			if(elsebranch!=null)
				elsebranch.typeCheck() ;
			return null;
			
		} else {
			System.out.println("Type Error: non boolean condition in if");
			return new ErrorType() ;
		}   
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
  		if(elsebranch!=null)
  			return s+"If\n" + guard.toPrint(s+"  ") + thenbranch.toPrint(s+"  ")  + elsebranch.toPrint(s+"  ") ; 
  		else
  			return s+"If\n" + guard.toPrint(s+"  ") + thenbranch.toPrint(s+"  "); 
  	}
	  
}  