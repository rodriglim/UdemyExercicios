package vetores;

import entities.Produto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exemplo2 {

    public static void main(String[] args) {

        Produto[] p;

        double precoTotal = 0;
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produtos? "));
            p = new Produto[n];

            for (int i = 0; i < p.length; i++) {

                String nomeProduto = JOptionPane.showInputDialog("Nome do Produto: ");
                double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto:R$ "));
                p[i] = new Produto(nomeProduto, precoProduto);

            }

            for (Produto p1 : p) {
                System.out.println(p1.toString());
                precoTotal += p1.getPreco();
            }

            String valorFormatado = String.format("%.2f", precoTotal / p.length);
            JOptionPane.showMessageDialog(null, "Preço Médio = " + valorFormatado);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
