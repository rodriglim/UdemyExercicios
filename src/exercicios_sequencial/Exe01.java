package exercicios_sequencial;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe01 {

    public static void main(String[] args) {

        Scanner lscanner = new Scanner(System.in);

        int num1, num2, soma;

        try {
            
            num1 = Integer.parseInt(JOptionPane.showInputDialog("1ª número inteiro: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("2ª número inteiro: "));
            soma = num1 + num2;
            JOptionPane.showMessageDialog(null, "Soma = " + soma);
            

        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Informações Inválidas! Tenta novamente");
            
        }
    }
}
