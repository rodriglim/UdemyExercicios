package exercicios_vetores;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exe05 {

    public static void main(String[] args) {

        double[] vetorNumeros;
        double maiorNumero = 0;
        int posicao = 0;

        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão digitados? "));
            vetorNumeros = new double[n];

            try {
                for (int i = 0; i < vetorNumeros.length; i++) {
                    vetorNumeros[i] = Double.parseDouble(JOptionPane.showInputDialog((i + 1) + "ª número: "));
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Tipo inválido");
            }
            
            for(int j = 0; j < vetorNumeros.length; j++){
                if(vetorNumeros[j] > maiorNumero){
                    maiorNumero = vetorNumeros[j];
                }
            }
            
            for(int k = 0; k < vetorNumeros.length; k++){
                if(vetorNumeros[k] == maiorNumero){
                    posicao = k;
                }
            }
            System.out.printf("Maior valor = %.1f\nPosição do maior valor = %d\n", maiorNumero, posicao);
            
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
