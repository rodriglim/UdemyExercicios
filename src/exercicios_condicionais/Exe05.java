package exercicios_condicionais;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe05 {

    public static void main(String[] args) throws Exception{

        int codigoProduto, quantidadeProduto;
     

        String[][] codigo = new String[][]{{"1", "2", "3", "4", "5"}, {"Cachorro Quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante"}};
        float[] precoComida = new float[]{4.00f, 4.50f, 5.00f, 2.00f, 1.50f};
        
        try {
            codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: ")) - 1;
            if (codigoProduto < 0 || codigoProduto > 4) {
                JOptionPane.showMessageDialog(null, "Código não existe");
            } else {
                quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade do produto: "));
                double valorFinal = precoComida[codigoProduto] * quantidadeProduto;
                String valorFormat = String.format("%.2f", valorFinal);
                JOptionPane.showMessageDialog(null, "Total:R$ " + valorFormat);
            }
             
            
        } catch (HeadlessException | NumberFormatException e) {
            
        }
    }
}
