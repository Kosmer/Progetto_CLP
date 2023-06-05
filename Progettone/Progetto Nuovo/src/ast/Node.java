package ast;

import java.util.ArrayList;

import semanticAnalysis.SemanticError ;
import semanticAnalysis.SymbolTable ;

public interface Node {

	ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting);
	Type typeCheck();
	String codeGeneration();

	String toPrint(String s);

}  