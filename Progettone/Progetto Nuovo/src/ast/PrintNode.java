package ast;

import java.util.ArrayList;

import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class PrintNode implements Node {
	private Node exp;
	
	public PrintNode (Node _exp) {
		    exp = _exp ;
	}
		  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
	 	  return exp.checkSemantics(ST, _nesting);
	 	}
	
	public Type typeCheck() {
		    return exp.typeCheck();
	}  
		  
	public Type typeCheck(int a) {
		return typeCheck();
	}
	
	public String codeGeneration() {
				return exp.codeGeneration()+"print\n";
	}

	public String toPrint(String s) {
		return s + "Print\n" +exp.toPrint(s+"  ") ;
	}
  
}  