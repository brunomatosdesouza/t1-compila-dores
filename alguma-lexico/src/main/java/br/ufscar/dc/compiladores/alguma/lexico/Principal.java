package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
// import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Principal {

    public static void main(String[] args) {
        // Cria um objeto para escrever no arquivo
        try(PrintWriter pw = new PrintWriter(new File(args[1]))) {

            try {
                
                // args[0] é o primeiro argumento da linha de comando
                // Ler o arquivo com o path que está em args[0]
                CharStream cs = CharStreams.fromFileName(args[0]);
                //Cria o lexer
                AlgumaLexer lex = new AlgumaLexer(cs);
                //Cria o parser
                CommonTokenStream tokens = new CommonTokenStream(lex);
                AlgumaParser parser = new AlgumaParser(tokens);
                //Remove tratamento padrão
                parser.removeErrorListeners();

                Integer contador_erro = 0;

                MyCustomErrorListener mcel = new MyCustomErrorListener(pw, contador_erro);
                parser.addErrorListener(mcel);
                
                parser.programa();
            } catch (IOException error) {
                error.printStackTrace();
            }
        } catch(FileNotFoundException fnfe) {
            // Caso o arquivo de saída não existir
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }

    }
}
