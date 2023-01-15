package exercicios_vetores;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe03 {

    public static void main(String[] args) {
        double alturaMedia = 0.0, menorIdadeMedia = 0.0;
        Pessoa[] pessoa;
        String[] nomes;

        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão digitadas: "));
            pessoa = new Pessoa[n];
            nomes = new String[n];

            for (int i = 0; i < pessoa.length; i++) {
                try {
                    JOptionPane.showMessageDialog(null, "Dados da " + (i + 1) + "ª pessoa: ");
                    String nome = JOptionPane.showInputDialog("Nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));

                    pessoa[i] = new Pessoa(nome, idade, altura);
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            for (Pessoa p : pessoa) {
                alturaMedia += p.getAltura() / pessoa.length;
            }

            System.out.printf("Altura Média: %.2f\n", alturaMedia);

            int qtd = 0;
            for (int j = 0; j < nomes.length; j++) {
                if (pessoa[j].getIdade() < 16) {
                    qtd++;
                    nomes[j] = pessoa[j].getNome();
                }
            }

            menorIdadeMedia = ((double) qtd / pessoa.length) * 100;
            System.out.printf("Pessoas com menos de 16 anos %.1f%%\n", menorIdadeMedia);

            for (String nome : nomes) {
                if (nome != null) {
                    System.out.println(nome);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
