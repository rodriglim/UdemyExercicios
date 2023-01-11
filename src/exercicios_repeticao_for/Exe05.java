package exercicios_repeticao_for;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe05 {

    static int numeroFatorar, aux;

    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, retornarFatoracao(Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "))));
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }

    private static int retornarFatoracao(int numero) {

        if (numero == 0) {
            numero = 1;
        } else {

            for (int i = (numero - 1); i > 1; i--) {
                aux = numero * i;
                numero = aux;
            }
        }
        return numero;
    }
}
