package ast;

import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanlib;
import semanticAnalysis.STentry;
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
	  
	  SymbolTable S1 = new SymbolTable();
	  S1 = ST.copy();
	  SymbolTable S2 = new SymbolTable();
	  S2 = ST.copy();
	  
	  
	  errors.addAll(guard.checkSemantics(ST, _nesting));
	  errors.addAll(thenbranch.checkSemantics(S1, _nesting));
	  errors.addAll(elsebranch.checkSemantics(S2, _nesting));
	  
	  ArrayList<HashMap<String,STentry>> t1 = S1.getSymbolTable();
	  ArrayList<HashMap<String,STentry>> t2 = S2.getSymbolTable();
	  
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
	  
	  return errors;
  }
  
	public Type typeCheck() {
		if (guard.typeCheck() instanceof BoolType) {
			
			Type thenexp = thenbranch.typeCheck() ;
			Type elseexp = elsebranch.typeCheck() ;
			if (thenexp.getClass().equals(elseexp.getClass()))
			{
				
				return thenexp;
			}
        		
			else {
				
        		System.out.println("Type Error: incompatible types in then and else branches");
        		return new ErrorType() ;	
			}
		} else {
			
			System.out.println("Type Error: non boolean condition in if");
			return new ErrorType() ;
		}   
	}
  
  	public String codeGeneration() {
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
  	}

  	public String toPrint(String s) {
	    return s+"If\n" + guard.toPrint(s+"  ") + thenbranch.toPrint(s+"  ")  + elsebranch.toPrint(s+"  ") ; 
	}
	  
}  