package ast;

import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanlib;
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
				if (dec.typeCheck() instanceof ErrorType)
					return new ErrorType();
		if (stmlist!=null) 
			for (Node stm:stmlist) {
				if (stm.typeCheck() instanceof ErrorType) {
					return new ErrorType();
				}
			}
				
					
		if (exp!=null)
			if (exp.typeCheck() instanceof ErrorType) {
				
				return new ErrorType();
			}
				
		return new VoidType();
	}  
  
	public String codeGeneration() {
		String declCode="";
		for (Node d: declist)
		    declCode += d.codeGeneration();
		String stmlCode="";
		for (Node s: stmlist)
		    stmlCode += s.codeGeneration();
		String expCode="";
		if(exp!=null)
			expCode+=exp.codeGeneration();
		return 	"move SP FP \n" +
				"pushr FP \n"+
				"move SP AL \n"+
				"pushr AL \n"+
				declCode +
				stmlCode +
				expCode +
				"halt\n"+
				SimpLanlib.getCode();
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