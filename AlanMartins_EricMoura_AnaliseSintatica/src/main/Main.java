package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import parser.Parser;
import lexer.Lexer;
import lexer.LexerException;
import node.Start;
import node.Token;


public class Main {
     protected static Token tk = null;
     //public static String nomeArq = "";
     public static void main(String[] arguments) {
          //nomeArq = arguments[0];
          try {  
                 File srcPath = new File("src\\doc\\teste.txt");
                 FileInputStream entrada = new FileInputStream(srcPath);
                 Lexer lex =  new Lexer( new PushbackReader(new InputStreamReader(entrada), 1024));
                 Parser p = new Parser(lex);
                 
                 Start ast = p.parse();
                 
                 //analiseLexica(lex);   
          }
          catch(Exception e) {
                  System.out.println(e.getMessage());
          }
          
          
     }
    
     
     public static void analiseLexica(Lexer lexer) throws LexerException, IOException{
         tk = lexer.next();
         while(!tk.getText().equals("")) {
             if(!tk.getText().equals(" ")){
                 System.out.println("["+tk.getLine()+","+tk.getPos()+"] "+  tk.getText()); 
             }
             /* if(tk.getText().contains("\n")){
                 System.out.println();
             }*/
             analiseLexica(lexer);
         }
         
     }
     
}