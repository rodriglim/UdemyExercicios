package exercicios_vetores;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exe02 {

    public static void main(String[] args) {
        double[] numerosVetores;
        double soma = 0.0, media = 0.0;
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão digitados: "));
            numerosVetores = new double[n];

            for (int i = 0; i < numerosVetores.length; i++) {
                try {
                    numerosVetores[i] = Double.parseDouble(JOptionPane.showInputDialog((i+1) + "ª número: "));
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            for (double j : numerosVetores) {
                soma += j;
            }

            media = soma / numerosVetores.length;
            System.out.print("Valores " + Arrays.toString(numerosVetores));
            System.out.println("\nSoma = " + soma);
            System.out.println("Média = " + media);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
