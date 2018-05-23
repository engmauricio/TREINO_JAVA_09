/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino_java_009;

import java.util.Scanner;

/**
 *
 * @author EngMauricio
 */
public class TREINO_JAVA_009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        String var;
        
        Scanner Read = new Scanner(System.in);
        
        System.out.println("Nome da Empresa");
        
        var = Read.nextLine();
        
        empresa myempresa = new empresa();
        
        myempresa.Org(var);
        
        nomeFunci mynomeFunci = new nomeFunci();
        
        mynomeFunci.Secretaria();    
    }  
}
