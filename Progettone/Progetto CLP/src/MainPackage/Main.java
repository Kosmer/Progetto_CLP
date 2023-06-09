package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;

import ast.ErrorType;
import ast.Node;
import ast.SVMVisitorImpl;
import ast.SimpLanPlusVisitorImpl;
import evaluator.ExecuteVM;
import parser.SVMLexer;
import parser.SVMParser;
import parser.SimpLanPlusBaseVisitor;
import parser.SimpLanPlusLexer;
import parser.SimpLanPlusParser;
import parser.SimpLanPlusVisitor;
import semanticAnalysis.SymbolTable;
import semanticAnalysis.SemanticError;

//							COME AVVIARE
//		Aprire un terminale dentro la cartella 'Progetto' e digitare il comando:
//			java -jar .\SimpLanPlus.jar
//		E' anche possibile ovviamente avviare direttamente da Eclipse.	
//		In più, è possibile personalizzare l'avvio decidendo di disattivare la fase di TypeChecking e quella di Codegen con il seguente comando
//			java -jar .\SimpLanPlus.jar 0 1
//		i due interi servono per disattivare (0) o attivare (1) rispettivamente le fasi di TypeChecking e quella di Codegen.
//		Questa scelta è stata presa per avviare correttamente gli esempi dell'esercizio 4, che altrimenti si sarebbero bloccati
//		al Typechecking a causa di errori di inizializzazione trovati nel codice, senza quindi eseguire la Codegen.

public class Main {

	public static void main(String[] args) throws IOException {
		
		Boolean custom = false;
		
		if(args.length==2) {
			custom = true;
		}
		
		String inputfile = "./src/InputOutput/input.txt";
		
		String outputfile = "./src/InputOutput/syntax_errors.txt";
		
		Boolean checkType = true;
		Boolean codegen = false;
		
				if (custom) {
			if(args[0].equals("0")) {
				checkType = false;
			}
				
		
			if(args[1].equals("1"))
				codegen = true;
		}
		
		
		
		//es 1
		String input = new String(Files.readAllBytes(Paths.get(inputfile)));
		CharStream stream = CharStreams.fromString(input);
		SimpLanPlusLexer lexer = new SimpLanPlusLexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);	
		
		//analisi sintattica
		Token token = lexer.nextToken();
		List<Token> lexerErrors = new ArrayList<>();
		
		
		while (token.getType() != SimpLanPlusLexer.EOF) {
			if(token.getType() == SimpLanPlusLexer.ERR)
				lexerErrors.add(token);
			token = lexer.nextToken();
			
		}
		
		File f = new File(outputfile);
		if(!f.exists()) {
			f.createNewFile();
		} else {
			f.delete();
			f.createNewFile();
		}

		if (lexerErrors.size() > 0){
			//se ci sono stati errori di sintassi
			System.out.println("There are " + lexerErrors.size() + " syntax errors. Errors are listed in syntax_errors.txt \n");
			//prende la lista dei simboli che non rientrano nella grammatica e li inserisce nel file di output
			for (int i=0;i<lexerErrors.size();i++) {
				int errLine = lexerErrors.get(i).getLine();
				String errStr = lexerErrors.get(i).getText();
				int errPos = lexerErrors.get(i).getCharPositionInLine() + 1;
				String toWrite = "[!] Error in line "+errLine+" character "+errPos+", symbol \"" + errStr + "\" not recognized.\n";
				Files.write(Paths.get(outputfile), toWrite.getBytes(), StandardOpenOption.APPEND);
			}
		} else {
			
			//se non ci sono stati errori di sintassi procedo con l'analisi semantica
			//es 2 e 3
			stream = CharStreams.fromString(input);
			lexer = new SimpLanPlusLexer(stream);
			tokenStream = new CommonTokenStream(lexer);
			SimpLanPlusParser parser = new SimpLanPlusParser(tokenStream);
			SimpLanPlusVisitorImpl visitor = new SimpLanPlusVisitorImpl();
			Node ast = visitor.visit(parser.prog()); //generazione AST 
			
			SymbolTable ST = new SymbolTable();
			ArrayList<SemanticError> errors = ast.checkSemantics(ST, 0);
			
			if(errors.size()>0){
				System.out.println("You had " + errors.size() + " errors:");
				for(SemanticError e : errors) {
					System.out.println("\t" + e);
				}
					
			} else {
				//System.out.println("Visualizing AST...");
				//System.out.println(ast.toPrint(""));
				
				
				
				//controllo se voglio fare TypeChecking o no (esercizi punto 4 lo bypassano)
				if(checkType) {
					Node type = (Node)ast.typeCheck(); //type-checking bottom-up 
					if (type instanceof ErrorType)
						System.out.println("Type checking is WRONG!");
					else {
						System.out.println("CheckSemantic ok!");
						System.out.println("Type checking ok!\n");
						System.out.println("Symbol Table: \n" + ST.toPrint());
						if(custom==false)
							codegen= true;
					}
				}
				
				//controllo se voglio fare CodeGen o no (esercizi punti 1-2-3 non la richiedono)
				if (codegen) {
				
				// CODE GENERATION  
				
					String code=ast.codeGeneration(); 
					BufferedWriter out = new BufferedWriter(new FileWriter(inputfile+".asm")); 
					out.write(code);
					out.close(); 
					System.out.println("Code generated! Assembling and running generated code.");
				
					String input2 = new String(Files.readAllBytes(Paths.get(inputfile + ".asm")));
					CharStream inputASM = CharStreams.fromString(input2);
					SVMLexer lexerASM = new SVMLexer(inputASM);
					CommonTokenStream tokensASM = new CommonTokenStream(lexerASM);
					SVMParser parserASM = new SVMParser(tokensASM);
	
					//parserASM.assembly();
	
					SVMVisitorImpl visitorSVM = new SVMVisitorImpl();
					visitorSVM.visit(parserASM.assembly()); 
	
					
					System.out.println("Starting Virtual Machine...");
					ExecuteVM vm = new ExecuteVM(visitorSVM.code);
					vm.cpu();
					
				}
				
			}
			
		
		}
		
		
	}

}
