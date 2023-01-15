package exercicios_repeticao_for;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe04 {

    public static void main(String[] args) {
        int qtdNumero;

        try {
            qtdNumero = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Números: "));

            for (int i = 1; i <= qtdNumero; i++) {
                JOptionPane.showMessageDialog(null, i + "ª pares de valores");
                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número: "));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número: "));

                if(n2 == 0){
                    JOptionPane.showMessageDialog(null, "Divisão Impossível");
                }else{
                    double divisao = (n1 / n2);
                    JOptionPane.showMessageDialog(null, divisao);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
