package exercicios_repeticao_for;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe06 {

    static int numeroInformado, divisor;

    public static void main(String[] args) {
        try {
            retornarCalculo(Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: ")));

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }

    private static void retornarCalculo(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(divisor = i);
            }
        }
    }
}
