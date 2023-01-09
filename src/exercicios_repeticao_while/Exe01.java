package exercicios_repeticao_while;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe01 {

    public static void main(String[] args) {

        final String SENHA_USUARIO = "2002";
        String senhaInformada;

        try {
            do {
                senhaInformada = JOptionPane.showInputDialog("Entre com uma senha: ");
                if (senhaInformada.equals(SENHA_USUARIO)) {
                    JOptionPane.showMessageDialog(null, "Acesso Autorizado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso Negado");

                }
            } while (!senhaInformada.equals(SENHA_USUARIO));

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Valores Inválidos");
        }
    }
}
