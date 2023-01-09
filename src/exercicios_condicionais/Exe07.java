package exercicios_condicionais;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe07 {

    public static void main(String[] args) {

        float casaDecimalX, casaDecimalY;

        try {
            casaDecimalX = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de X: "));
            casaDecimalY = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de Y: "));

            if ((casaDecimalX == 0.0f) && (casaDecimalY == 0.0f)) {
                JOptionPane.showMessageDialog(null, "Origem");
            } else if ((casaDecimalX > 0.0f) && (casaDecimalY > 0.0f)) {
                JOptionPane.showMessageDialog(null, "Q1");
            } else if ((casaDecimalX < 0.0f) && (casaDecimalY > 0.0f)) {
                JOptionPane.showMessageDialog(null, "Q2");
            } else if ((casaDecimalX < 0.0f) && (casaDecimalY < 0.0f)) {
                JOptionPane.showMessageDialog(null, "Q3");
            } else {
                JOptionPane.showMessageDialog(null, "Q4");
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas!");
        }
    }

}
