/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaArrayliste;

import java.util.ArrayList;

/**
 *
 * @author Marcio pedro Schiehl
 */
public class Lista02 {
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList<>();
        
        nomes.add("Sueli");
        nomes.add("Silverio");
        nomes.add("Mauricio");
        nomes.add("Darci");
        nomes.add("Laercio");
        nomes.add("Anderson");
        nomes.add("Terli");
        nomes.add("Pedro");
        nomes.add("Sabrina");
        
        
        System.out.println("nomes:\n" + nomes.get(0) +"\n"+ nomes.get(1)+"\n"+
                nomes.get(2)+"\n"+nomes.get(3)+"\n"+nomes.get(4)+"\n"+
                nomes.get(5)+"\n"+nomes.get(6)+"\n"+nomes.get(7)+"\n"+nomes.get(8));
    }
    
}
