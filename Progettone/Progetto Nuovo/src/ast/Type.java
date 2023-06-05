package ast;

import java.util.ArrayList;

import semanticAnalysis.SemanticError;
import semanticAnalysis.SymbolTable;

public class Type implements Node {
	public boolean isEqual(Type A, Type B) {
		if (A.getClass().equals(B.getClass())) return true ;
		else return false ;
	}
	public String toPrint(String s) {
		return s ;  
	}

	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		// It is never invoked
		return null;
	}
	@Override
	public Type typeCheck() {
		// It is never invoked
		return null;
	}
	@Override
	public Type typeCheck(int a) {
		// It is never invoked
		return null;
	}
	@Override
	public String codeGeneration() {
		// It is never invoked
		return "";
	}

}
