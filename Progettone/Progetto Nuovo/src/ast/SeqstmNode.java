package ast;

import java.util.ArrayList;
import java.util.HashMap;

import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError ;
import semanticAnalysis.SymbolTable ;

public class SeqstmNode implements Node {
	private ArrayList<Node> stmlist;
	private int nesting ;
  
	public SeqstmNode (ArrayList<Node> _stmlist) {
		stmlist = _stmlist;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {		
		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		nesting = _nesting ;
		
		for (Node stm : stmlist)
			errors.addAll(stm.checkSemantics(ST, nesting));
		
		return errors;
	}

	public Type typeCheck() {
		if (stmlist!=null) 
			for (Node stm:stmlist)
				stm.typeCheck();
		return null;
	}  
  
	public String codeGeneration() {
		/*
		 * DA RIFARE
		 * 
		 * return exp.codeGeneration()+"halt\n";
		 */
		return "";
	}  
  
	public String toPrint(String s) {
		String stmlstr= "";
		
		if (stmlist!=null) {
			for (Node stm:stmlist)
			    stmlstr+=stm.toPrint(s+" ");
			stmlstr+="\n";
		}
			  
		return s+"" + "\n  "
	   	   +stmlstr;
	}

}  