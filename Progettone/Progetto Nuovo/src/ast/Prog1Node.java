package ast;

import java.util.ArrayList;

import semanticAnalysis.SemanticError ;
import semanticAnalysis.SymbolTable ;

public class Prog1Node implements Node {
	private Node exp;
  
	public Prog1Node (Node _exp) {
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
		return exp.codeGeneration()+"halt\n";
	}  
  
	public String toPrint(String s) {
		return "Prog1\n" + exp.toPrint("  ") ;
	}

}  