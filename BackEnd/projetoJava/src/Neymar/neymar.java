package Neymar;

import javax.swing.JOptionPane;

public class neymar {
    public static void main(String[] args) {
        

        int resposta = JOptionPane.showConfirmDialog(null, "O neymar e o melhor do mundo? ", "", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Bouaaa isso memo ele e o melhor do mundo memo");
        }else{
            JOptionPane.showMessageDialog(null, "Você ganhou oq pra vc está falando merda");
            JOptionPane.showInputDialog(null, "Agr você vai falar oq q vc ganhou");
            JOptionPane.showMessageDialog(null, "Você nunca ganhou nada n mlk");
        }

















    }   
   
}