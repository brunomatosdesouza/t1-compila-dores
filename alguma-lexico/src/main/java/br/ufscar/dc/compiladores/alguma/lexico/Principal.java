package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Principal {

    public static void main(String[] args) {
        // Pega o segundo argumento da linha de comando para criar o arquivo de saída
        String arquivoSaida = args[1];

        // Cria um objeto para escrever no arquivo
        try(PrintWriter pw = new PrintWriter(arquivoSaida)) {

            try {
                // args[0] é o primeiro argumento da linha de comando
                // Ler o arquivo com o path que está em args[0]
                CharStream cs = CharStreams.fromFileName(args[0]);
                AlgumaLexer lex = new AlgumaLexer(cs);
                
                //Enquanto achar um token, escreverá no arquivo de saída
                // Token t = null;
                // while ((t = lex.nextToken()).getType() != Token.EOF) {
                    
                //     if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "PALAVRA_CHAVE") {
                //         pw.println("<" + '\'' + t.getText() + '\''+ "," + '\'' + t.getText() + '\'' + ">");   
                //     } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_NAO_FECHADA")) {
                //         pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                //         break;
                //     } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("COMENTARIO_NAO_FECHADO")) {
                //         pw.println("Linha " + t.getLine() + ": comentario nao fechado");
                //         break;
                //     } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("SIMBOLO_NAO_IDENTIFICADO")) {
                //         pw.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                //         break;
                //     }else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "OP_REL") {
                //         pw.println("<" + '\'' + t.getText() + '\''+ "," + '\'' + t.getText() + '\'' + ">");
                //     } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "TIPOS") {
                //         pw.println("<" + '\'' + t.getText() + '\''+ "," + '\'' + t.getText() + '\'' + ">");
                //     } else {
                //         pw.println("<" + '\'' + t.getText() + '\''+ "," + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + ">");
                //     }
                // }

                CommonTokenStream tokens = new CommonTokenStream(lex);
                AlgumaParser parser = new AlgumaParser(tokens);
                parser.programa();
            } catch (IOException error) {
                error.printStackTrace();
            }
            // Quando terminar de escrever, fecha o arquivo de saída
            pw.close();
        } catch(FileNotFoundException fnfe) {
            // Caso o arquivo de saída não existir
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }

    }
}
