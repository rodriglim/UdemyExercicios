package exercicios_repeticao_for;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe01 {

    static int valorFinal = 0;

    public static void main(String[] args) {

        try {
            valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
            getImpares(valorFinal);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas!");
        }
    }

    private static void getImpares(int valor) {
        int[] valoresImpares = new int[valor];
        for (int i = 1; i <= valor; i++) {
            if ((i % 2) != 0) {
                valoresImpares[i] = i;
            }
        }

        for (int j : valoresImpares) {
            if(j != 0) 
                System.out.println(j);
            }
        }
}
