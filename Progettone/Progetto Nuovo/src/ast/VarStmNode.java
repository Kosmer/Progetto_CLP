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
	private int id_offset;
	private int id_nesting;
	
	public VarStmNode(String _id, Node _exp) {
		id = _id ;
		exp = _exp ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
   		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
  		nesting = _nesting ;
        
  		STentry T = ST.lookup(id);
  		
  		
        if (T == null) 
        	errors.add(new SemanticError("Var id '" + id + "' not declared"));
        
        else {
        	T.setInitialized();
        	id_offset = T.getoffset();
        	id_nesting = T.getnesting();
        	type = T.gettype();
        }
        
        errors.addAll(exp.checkSemantics(ST, nesting));
        
        return errors ;
	}
  
	public Type typeCheck () {
		Type expvar = exp.typeCheck(); 
		if(expvar instanceof ErrorType) {
			
			return new ErrorType() ;
		}
		else if (expvar.getClass().equals(type.getClass() )) {
			
			return new VoidType() ;
		}
			
		else {
			System.out.println("Type Error: incompatible type of expression for variable "+id) ;
			return new ErrorType() ;
		}
		    
	}
  
	public String codeGeneration() {
		String getAR="";
		for (int i=0; i < nesting - id_nesting; i++) 
	    	 getAR += "store T1 0(T1) \n";
		return exp.codeGeneration() +
				"move AL T1 \n" +
				getAR+
				"subi T1 " + id_offset +"\n" +
				"load A0 0(T1) \n"+
				"pushr A0 \n" ;
	}  
    
	public String toPrint(String s) {
		
        
		return s + "StmVar:" + id + type.toPrint(" ") + "\n" + exp.toPrint(s+"\t"); 
	}

}  