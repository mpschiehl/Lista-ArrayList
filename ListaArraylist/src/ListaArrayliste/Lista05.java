/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaArrayliste;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Lista05 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        String comparativo = "";
        int torf = 0;
        for(int i = 0;i<4;i++){
          nomes.add(JOptionPane.showInputDialog(null, "Informe o nome",+ i +" Tela ",JOptionPane.QUESTION_MESSAGE));
        }
        comparativo =JOptionPane.showInputDialog(null,"Informe um numero.");
        for(int i =0; i<nomes.size();i++){
            if(nomes.get(i).equals(comparativo)){
                JOptionPane.showMessageDialog(null, "Nome já esta na lista");
                torf++;
            }
            }
        if (torf == 0){
            JOptionPane.showMessageDialog(null, "Nome não esta na lista");
        }
    }
    
}
