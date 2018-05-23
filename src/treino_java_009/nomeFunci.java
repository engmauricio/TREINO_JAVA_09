/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino_java_009;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EngMauricio
 */
public class nomeFunci {
    
    public void Secretaria(){
        
            String n;
            
            ArrayList<String> Nomes = new ArrayList<>();
            
            Nomes.add("JOAO");
            Nomes.add("MANOEL");
            
           // System.out.println(Nomes.toString());
            
            Scanner Ler = new Scanner(System.in);
            
            System.out.println("Nome funcionario: ");
            
            n = Ler.nextLine(); 
            
            Nomes.add(n);
            
            System.out.println(Nomes.toString());      
            
    }
      
}
