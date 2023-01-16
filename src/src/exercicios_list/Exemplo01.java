package exercicios_list;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Exemplo01 {

    public static void main(String[] args) {

        int qtdPessoa;
        List<Integer> idEmpregados;
        idEmpregados = new ArrayList<>();
        List<String> nomeEmpregados;
        nomeEmpregados = new ArrayList<>();
        List<Double> salarioEmpregados;
        salarioEmpregados = new ArrayList<>();
        int porcentagem = 0;

        try {
            qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog("Quantos empregados serão registrados? "));

            try {
                for (int i = 0; i < qtdPessoa; i++) {
                    JOptionPane.showMessageDialog(null, "Funcionário #:" + (i + 1));
                    idEmpregados.add(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
                    nomeEmpregados.add(JOptionPane.showInputDialog("Nome: "));
                    salarioEmpregados.add(Double.parseDouble(JOptionPane.showInputDialog("Salário:R$ ")));
                }

                nomeEmpregados.forEach((nomes) -> {
                    System.out.println(nomes);
                });
                int idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do funcionário que deseja aumentar o salário: "));

                if (idEmpregados.contains(idFuncionario)) {
                    porcentagem = Integer.parseInt(JOptionPane.showInputDialog("Informe a porcentagem: "));
                    double salario = salarioEmpregados.get(idEmpregados.indexOf(idFuncionario));
                    double novoSalario = salario + (salario * porcentagem / 100);
                    int posicaoDoId = idEmpregados.indexOf(idFuncionario);
                    salarioEmpregados.remove(posicaoDoId);
                    salarioEmpregados.add(posicaoDoId, novoSalario);
                } else {
                    JOptionPane.showMessageDialog(null, "ID não existe");
                }

                for (int j = 0; j < qtdPessoa; j++) {
                    System.out.println(idEmpregados.get(j) + "," + nomeEmpregados.get(j) + "," + salarioEmpregados.get(j));
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
