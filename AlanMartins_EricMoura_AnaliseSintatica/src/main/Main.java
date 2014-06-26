package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.Scanner;

import parser.Parser;
import lexer.Lexer;
import lexer.LexerException;
import node.Start;
import node.Token;


public class Main {
     protected static Token tk = null;
     public static String nomeArq = "";
     
     public static void main(String[] arguments) {
         
         if(! (arguments.length == 0)){
             nomeArq = arguments[0];
         }else{
             nomeArq = "src\\doc\\testeSintatico.txt";
         }
          
          try {  
                 File srcPath = new File(nomeArq);
                 FileInputStream entrada = new FileInputStream(srcPath);
                 Lexer lex =  new Lexer( new PushbackReader(new InputStreamReader(entrada), 1024));
                 //analiseLexica(lex);
                 
                 Parser p = new Parser(lex);           
                 Start ast = p.parse();
            
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