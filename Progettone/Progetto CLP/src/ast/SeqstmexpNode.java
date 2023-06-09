package ast;

import java.util.ArrayList;
import java.util.HashMap;

import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError ;
import semanticAnalysis.SymbolTable ;

public class SeqstmexpNode implements Node {
	private ArrayList<Node> stmlist;
	private Node exp;
	private int nesting ;
  
	public SeqstmexpNode (ArrayList<Node> _stmlist, Node _exp) {
		stmlist = _stmlist;
		exp = _exp ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {		
		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		nesting = _nesting ;
		
		for (Node stm : stmlist)
			errors.addAll(stm.checkSemantics(ST, nesting));
		if (exp!=null)
			errors.addAll(exp.checkSemantics(ST, nesting));
		
		return errors;
	}

	public Type typeCheck() {
		Type stmNode = null;
		if (stmlist!=null) 
			for (Node stm:stmlist) {
				stmNode= stm.typeCheck();
				if (stmNode instanceof ErrorType)
				{
					return new ErrorType();
				}
					
			}
		
		return exp.typeCheck();

		
	}  
  
	public String codeGeneration() {
		String stmlCode="";
		for (Node s: stmlist)
		    stmlCode += s.codeGeneration();
		return stmlCode +
				exp.codeGeneration();
	}  
  
	public String toPrint(String s) {
		String stmlstr= "";
		String explstr="";
		
		if (stmlist!=null) {
			for (Node stm:stmlist)
			    stmlstr+=stm.toPrint(s+" ");
			stmlstr+="\n";
		}
			  
		explstr+=exp.toPrint(s+" ");
		return s+"" + "\n  "
	   	   +stmlstr 
	   	   +explstr;
	}

}  