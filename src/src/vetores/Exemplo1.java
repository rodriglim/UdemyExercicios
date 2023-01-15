package vetores;

import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double[] vetorAltura;
        double media = 0;

        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão informadas? "));
            vetorAltura = new double[n];

            for (int i = 0; i < n; i++) {
                double altura = Double.valueOf(JOptionPane.showInputDialog("Altura: "));
                try {
                    vetorAltura[i] = altura;

                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Dados Inválidos");
                }

            }
            for (double mediaAltura : vetorAltura) {
                media += mediaAltura;
            }

            String mediaFormatada = String.format("Altura Média = %.2f\n", (media / vetorAltura.length));
            JOptionPane.showMessageDialog(null, mediaFormatada);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
