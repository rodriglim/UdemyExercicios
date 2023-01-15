package exercicios_repeticao_for;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe07 {

    static int n;

    public static void main(String[] args) {

        try {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            mostrarTabela();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }

    private static void mostrarTabela() {
        for (int i = 1; i <= n; i++) {
            int valorQuadrado = i * i;
            int valorCubo = (int) Math.pow(i, 3);
            System.out.println(i + " " + valorQuadrado + " " + valorCubo);
        }
    }
}
