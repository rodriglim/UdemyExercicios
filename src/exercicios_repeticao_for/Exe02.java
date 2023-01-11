package exercicios_repeticao_for;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe02 {

    public static void main(String[] args) {

        int in = 0, out = 0;

        try {
            int qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de números: "));

            for (int i = 1; i <= qtdNumeros; i++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(i + "ª número: "));
                if (numero >= 10 && numero <= 20) {
                    in++;
                } else {
                    out++;
                }
            }
            String totalFormat = String.format("%d in%n%d out%n", in, out);
            JOptionPane.showMessageDialog(null, totalFormat);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
