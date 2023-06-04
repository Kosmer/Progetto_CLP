package ast;

import java.util.ArrayList;
import java.util.HashMap;

import semanticAnalysis.STentry;
import semanticAnalysis.SemanticError ;
import semanticAnalysis.SymbolTable ;

public class Prog2Node implements Node {
	private ArrayList<Node> declist;
	private ArrayList<Node> stmlist;
	private Node exp;
	private int nesting ;
  
	public Prog2Node (ArrayList<Node> _declist, ArrayList<Node> _stmlist, Node _exp) {
		declist = _declist ;
		stmlist = _stmlist;
		exp = _exp ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {		
		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		HashMap<String,STentry> HM = new HashMap<String,STentry>();
		ST.add(HM);
		nesting = _nesting ;
		
		for (Node dec : declist)
			errors.addAll(dec.checkSemantics(ST, nesting));
		for (Node stm : stmlist)
			errors.addAll(stm.checkSemantics(ST, nesting));
		if (exp!=null)
			errors.addAll(exp.checkSemantics(ST, nesting));
		
		return errors;
	}

	public Type typeCheck() {
		if (declist!=null) 
			for (Node dec:declist)
				dec.typeCheck();
		if (stmlist!=null) 
			for (Node stm:stmlist)
				stm.typeCheck();
		if (exp!=null)
			exp.typeCheck();
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
		String declstr= "";
		String stmlstr= "";
		String explstr="";
		if (declist!=null) {
			for (Node dec:declist)
			    declstr+=dec.toPrint(s+" ");
			declstr+="\n";
		}
		  
		if (stmlist!=null) {
			for (Node stm:stmlist)
			    stmlstr+=stm.toPrint(s+" ");
			stmlstr+="\n";
		}
			  
		if (exp!=null)
				explstr+=exp.toPrint(s+" ");
		return s+"Prog2:" + "\n"
	   	   +declstr 
	   	   +stmlstr 
	   	   +explstr;
	}

}  