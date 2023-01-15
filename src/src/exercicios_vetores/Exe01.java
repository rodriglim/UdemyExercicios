package exercicios_vetores;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe01 {
    
    public static void main(String[] args){
        
        int[] numeroNegativos = new int[10];
        
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão digitados? "));
            
            for(int i = 1; i <= n; i++){
                int numero = Integer.parseInt(JOptionPane.showInputDialog(i + "ª número: "));
                
                if(numero < 0){
                    numeroNegativos[i] = numero;
                }
            }
            
            System.out.println("Números Negativos: ");
            for(int numerosNegativosVetor : numeroNegativos){
                if(!(numerosNegativosVetor == 0)){
                    System.out.println(numerosNegativosVetor);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
        }
    }
}
