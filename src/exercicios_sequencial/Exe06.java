package exercicios_sequencial;

import java.awt.HeadlessException;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe06 {

    public static void main(String[] args) {

        Scanner lScanner = new Scanner(System.in);

        int codigoPeca, qtdRoupa;
        double precoPeca, totalPreco1, totalPreco2, totalPreco;

        try {

            codigoPeca = Integer.parseInt(JOptionPane.showInputDialog("Código da Peça - 1: "));
            qtdRoupa = Integer.parseInt(JOptionPane.showInputDialog("O número da Peças - 1: "));
            precoPeca = Double.parseDouble(JOptionPane.showInputDialog("Preço da Peça - 1:R$ "));

            totalPreco1 = precoPeca * qtdRoupa; 
                    
            codigoPeca = Integer.parseInt(JOptionPane.showInputDialog("Código da Peça - 2: "));
            qtdRoupa = Integer.parseInt(JOptionPane.showInputDialog("O número da Peças - 2: "));
            precoPeca = Double.parseDouble(JOptionPane.showInputDialog("Preço da Peça - 2:R$ "));

            totalPreco2 = precoPeca * qtdRoupa; 
            
            totalPreco = totalPreco1 + totalPreco2;
            
            
            Locale.setDefault(Locale.US);
            String precoFormat = String.format("%.2f", totalPreco);
            
            JOptionPane.showMessageDialog(null, "VALOR A PAGAR: R$ " + precoFormat);
            
        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Valores Inválidos!");
            
        }
    }
}
