package exercicios_vetores;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe06 {

    public static void main(String[] args) {
        int[] vetorA;
        int[] vetorB;
        int[] vetorResultante;

        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos valores terão cada vetor? "));
            vetorA = new int[n];
            vetorB = new int[n];
            vetorResultante = new int[vetorA.length];

            try {
                for (int vA = 0; vA < vetorA.length; vA++) {
                    vetorA[vA] = Integer.parseInt(JOptionPane.showInputDialog((vA+1) + "ª número do vetor A: "));
                }
                for (int vB = 0; vB < vetorB.length; vB++) {
                    vetorB[vB] = Integer.parseInt(JOptionPane.showInputDialog((vB+1) + "ª número do vetor B: "));

                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Tipo Inválido");
            }
            
            for (int i = 0; i < vetorA.length; i++) {
                vetorResultante[i] = vetorA[i] + vetorB[i];
            }

            for (int valor : vetorResultante) {
                System.out.println(valor);
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informação Inválida");
        }

    }
}
