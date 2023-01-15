package exercicios_condicionais;

import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Exe06 {

    public static void main(String[] args){

        double valorInserido;
        try {
            valorInserido = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));

            if ((valorInserido < 0) || (valorInserido > 100)) {
                JOptionPane.showMessageDialog(null, "Fora do Intervalo");
            } else if ((valorInserido == 0.0) || (valorInserido <= 25.0)) {
                JOptionPane.showMessageDialog(null, "Intervalo (0 , 25)");
            } else if (valorInserido <= 50) {
                JOptionPane.showMessageDialog(null, "Intervalo (25 , 50)");
            } else if (valorInserido <= 75) {
                JOptionPane.showMessageDialog(null, "Intervalo (50 , 75)");
            } else {
                JOptionPane.showMessageDialog(null, "Intervalo (75 , 100)");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
