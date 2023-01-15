package exercicios_repeticao_while;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe03 {

    final static String COD_ALCOOL = "1", COD_GASOLINA = "2", COD_DIESEL = "3";
    static String codInserido;
    static int alcool = 0, gasolina = 0, diesel = 0;

    public static void main(String[] args) {

        try {
            do {
                codInserido = JOptionPane.showInputDialog("Código: ");
                postoCombustivel(codInserido);
            } while (!codInserido.equals("4"));
            JOptionPane.showMessageDialog(null, postoCombustivel(codInserido));
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }

    private static String postoCombustivel(String codCombustivel) {
        switch (codCombustivel) {
            case COD_ALCOOL:
                alcool++;
                break;
            case COD_GASOLINA:
                gasolina++;
                break;
            case COD_DIESEL:
                diesel++;
                break;
            default:
                break;
        }
        String textoFormatado = String.format("Muito Obrigado\n"
                + "Álcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
        return textoFormatado;
    }
}
