package exercicios_sequencial;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe04 {

    public static void main(String[] args) {

        Scanner lScanner = new Scanner(System.in);

        int id, horasTrabalhadas;
        double valorHora, salarioBruto;

        try {

            id = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do Funcionário: "));
            horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de horas trabalhadas do Funcionário: "));
            valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor-hora do Funcionário: "));

            salarioBruto = (horasTrabalhadas * valorHora);
            JOptionPane.showMessageDialog(null, "<html>ID = " + id + "<br>Salário = R$ " + salarioBruto);
            
        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Valores Inválidos! Tente Novamente");
        }

    }
}
