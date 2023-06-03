package ast;

import java.util.ArrayList;

import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class VarStmNode implements Node {
	private String id;
	private Node type;
	private Node exp;
	private int nesting;
	
	public VarStmNode(String _id, Node _exp) {
		id = _id ;
		exp = _exp ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
   		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
  		nesting = _nesting ;
        
  		STentry T = ST.lookup(id);
  		
        if (T == null) 
        	errors.add(new SemanticError("Var id " + id + " not declared"));
        else T.setInitialized();
        
        type = T.gettype();
        return errors ;
	}
  
	public Type typeCheck () {
		if (exp.typeCheck().getClass().equals(type.getClass() )) 
			return null ;
		else {
			System.out.println("Type Error: incompatible type of expression for variable "+id) ;
			return new ErrorType() ;
		}
		    
	}
  
	public String codeGeneration() {
		/*
		 * DA RIFARE
		 
		return exp.codeGeneration() +
				"pushr A0 \n" ;
		*/
		return "";
	}  
    
	public String toPrint(String s) {
		return s + "StmVar:" + id + type.toPrint(" ") + "\n" + exp.toPrint(s+"\t"); 
	}

}  