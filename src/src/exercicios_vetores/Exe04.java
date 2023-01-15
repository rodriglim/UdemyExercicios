package exercicios_vetores;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe04 {

    public static void main(String[] args) {

        int vetorPares[];
        int totalPares = 0;

        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão digitados? "));
            vetorPares = new int[n];

            try {
                for (int i = 0; i < vetorPares.length; i++) {
                    int numero = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "ª número inteiro: "));
                    if (numero % 2 == 0) {
                        vetorPares[i] = numero;
                        totalPares++;
                    }
                }

                System.out.println("Números Pares: ");
                for (int numerosPares : vetorPares) {
                    if (!(numerosPares == 0)) {
                        System.out.print(numerosPares + " ");
                    }

                }
                System.out.println("");
                System.out.println("Quantidade de Pares: " + totalPares);
                
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Tipo inválido!");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
