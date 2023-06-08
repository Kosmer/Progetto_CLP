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
		Type stmNode = null;
		if (stmlist!=null) 
			for (Node stm:stmlist) {
				stmNode= stm.typeCheck();
				if (stmNode instanceof ErrorType)
					return new ErrorType();
			}
		return stmNode;
	}  
  
	public String codeGeneration() {
		String stmlCode="";
		for (Node s: stmlist)
		    stmlCode += s.codeGeneration();
		return stmlCode;
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
	
	public int getStmLenght() {
		return stmlist.size();
	}
	
	public ArrayList<Node> getStmList(){
		return stmlist;
	}

}  