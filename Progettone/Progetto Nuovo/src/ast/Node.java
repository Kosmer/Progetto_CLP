package ast;

import java.util.ArrayList;

import semanticAnalysis.SemanticError ;
import semanticAnalysis.SymbolTable ;

public interface Node {

	ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting);
	Type typeCheck();
	Type typeCheck(int a);
	String codeGeneration();

	String toPrint(String s);

}  