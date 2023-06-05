package MainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;

import ast.ErrorType;
import ast.Node;
import ast.SimpLanPlusVisitorImpl;
import parser.SimpLanPlusBaseVisitor;
import parser.SimpLanPlusLexer;
import parser.SimpLanPlusParser;
import parser.SimpLanPlusVisitor;
import semanticAnalysis.SymbolTable;
import semanticAnalysis.SemanticError;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//es 1
		String input = new String(Files.readAllBytes(Paths.get("src\\input.txt")));
		CharStream stream = CharStreams.fromString(input);
		SimpLanPlusLexer lexer = new SimpLanPlusLexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		
		//es 2
		//da implementare basandosi sull'interfaccia SimpLanPlusVisitor
		SimpLanPlusParser parser = new SimpLanPlusParser(tokenStream);
		SimpLanPlusVisitorImpl visitor = new SimpLanPlusVisitorImpl();
		Node ast = visitor.visit(parser.prog()); //generazione AST 
		
		
		
		//analisi sintattica
		Token token = lexer.nextToken();
		List<Token> lexerErrors = new ArrayList<>();
		
		while (token.getType() != SimpLanPlusLexer.EOF) {
			if(token.getType() == SimpLanPlusLexer.ERR)
				lexerErrors.add(token);
			token = lexer.nextToken();
		}
		
		File f = new File("src\\lexical_errors.txt");
		if(!f.exists()) {
			f.createNewFile();
		} else {
			f.delete();
			f.createNewFile();
		}

		
		
		if (lexerErrors.size() > 0){
			//se ci sono stati errori di sintassi
			System.out.println("Ci sono: " + lexerErrors.size() + " errori lessicali.\n");
			//prende la lista dei simboli che non rientrano nella grammatica e li inserisce nel file di output
			for (int i=0;i<lexerErrors.size();i++) {
				int errLine = lexerErrors.get(i).getLine();
				String errStr = lexerErrors.get(i).getText();
				int errPos = lexerErrors.get(i).getCharPositionInLine() + 1;
				String toWrite = "Errore, simbolo \"" + errStr + "\" non riconosciuto.\n";
				Files.write(Paths.get("src\\lexical_errors.txt"), toWrite.getBytes(), StandardOpenOption.APPEND);
			}
		} else {
			
			
			
			System.out.println("AAAAAAAAAAA");
			//se non ci sono stati errori di sintassi procedo con l'analisi semantica
			SymbolTable ST = new SymbolTable();
			ArrayList<SemanticError> errors = ast.checkSemantics(ST, 0);
			
			if(errors.size()>0){
				System.out.println("You had: " + errors.size() + " errors:");
				for(SemanticError e : errors)
					System.out.println("\t" + e);
			} else {
				System.out.println("Visualizing AST...");
				System.out.println(ast.toPrint(""));
				
				//controllare casting
				Node type = (Node)ast.typeCheck(); //type-checking bottom-up 
				if (type instanceof ErrorType)
					System.out.println("Type checking is WRONG!");
				else 
					System.out.println("Type checking ok!");

				
			}
			
		
		}
		
		
	}

}
