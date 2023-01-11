package exercicios_repeticao_for;

import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Exe03 {

    static double nota1, nota2, nota3, mediaPonderada;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            int qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Números: "));

            for (int i = 0; i < qtdNumeros; i++) {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
                nota2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota: "));
                System.out.println(getMediaPonderada(nota1, nota2, nota3));
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }

    private static String getMediaPonderada(double n1, double n2, double n3) {
       mediaPonderada = ((n1 * 2 + n2 * 3 + n3 * 5) / (10));
       return String.format("%.1f", mediaPonderada);
    }
}
