package parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		String input = new String(Files.readAllBytes(Paths.get("src\\input.txt")));
		CharStream stream = CharStreams.fromString(input);
		SimpLanPlusLexer lexer = new SimpLanPlusLexer(stream);
		List<Token> lexerErrors = new ArrayList<>();
		Token token = lexer.nextToken();
		
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
		
		System.out.println("Ci sono: " + lexerErrors.size() + " errori lessicali.\n");
		//prende la lista dei simboli che non rientrano nella grammatica e li inserisce nel file di output
		for (int i=0;i<lexerErrors.size();i++) {
			int errLine = lexerErrors.get(i).getLine();
			String errStr = lexerErrors.get(i).getText();
			int errPos = lexerErrors.get(i).getCharPositionInLine() + 1;
			String toWrite = "Errore, simbolo \"" + errStr + "\" non riconosciuto.\n";
			Files.write(Paths.get("src\\lexical_errors.txt"), toWrite.getBytes(), StandardOpenOption.APPEND);
		}
	}

}
