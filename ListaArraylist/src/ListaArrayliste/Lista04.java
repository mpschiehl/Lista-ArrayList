/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaArrayliste;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author Marcio pedro Schiehl
 */
public class Lista04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random randonico = new Random();
        int limete = 10;
        String list = "";
        //Gerrador de numeros aleatorios.
        for(int posicao = 0;posicao<limete;posicao++){
            numeros.add(randonico.nextInt(101));
            list += numeros.get(posicao) + 
                    " Na possição " + posicao + "\n";
            System.out.println(numeros.get(posicao));
        }
        // Exibe todos os valores atribuidos;
        JOptionPane.showMessageDialog(null, list,"Primeira Sequencia",JOptionPane.INFORMATION_MESSAGE);
        // remove posição 3 e limpa a String utilizado para demostrar saida
        numeros.remove(3);
            list = "";
        // Alimenta a String com os nova sequencia e demostra.
        for(int i = 0;i<numeros.size(); i++){
            list += numeros.get(i) + " Na possição " + i + "\n";
        }
        JOptionPane.showMessageDialog(null, list,"Segunda Sequencia",JOptionPane.INFORMATION_MESSAGE);
         // remove posição 3 e limpa a String utilizado para demostrar saida
        numeros.remove(3);
        list = "";
        // Alimenta a String com os nova sequencia e demostra.
        for(int i = 0;i<numeros.size(); i++){
            list += numeros.get(i) + " Na possição " + i + "\n";
        }
        JOptionPane.showMessageDialog(null, list,"Resultado Final",JOptionPane.INFORMATION_MESSAGE);
    
    }
}
