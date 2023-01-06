package exercicios_sequencial;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe03 {

    public static void main(String[] args) {

        Scanner lScanner = new Scanner(System.in);

        int valorA, valorB, valorC, valorD, diferenca;

        try {

            valorA = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
            valorB = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
            valorC = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));
            valorD = Integer.parseInt(JOptionPane.showInputDialog("Valor de D: "));
            diferenca = (valorA * valorB - valorC * valorD);
            JOptionPane.showMessageDialog(null, "Diferença = " + diferenca);

        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Valores Inválidos, Tente novamente");
            
        }
    }
}
