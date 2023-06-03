package ast;

import java.util.ArrayList;
import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class DecNode implements Node {
	private String id;
	private Node type;
	private int nesting;
	
	public DecNode(String _id, Node _type) {
		id = _id ;
		type = _type ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
   		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
  		nesting = _nesting ;
        
        if (ST.top_lookup(id) == true) 
        	errors.add(new SemanticError("Var id " + id + " already declared"));
        else ST.insert(id, (Type) type, nesting,"") ;
 
        return errors ;
	}
  
	public Type typeCheck () {
		/*
		 * Giusto?
		 */
		return new VoidType();
		    
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
		/*
		 * Giusto?
		 */
		return s + "DecVar:" + id + type.toPrint(" "); 
	}

}  