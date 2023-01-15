package exercicios_condicionais;

import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Exe08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double salarioRoubus, impostoDeRenda;

        try {
            salarioRoubus = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário:R$ "));

            if (salarioRoubus <= 2000) {
               impostoDeRenda = 0.0;
            } else if (salarioRoubus <= 3000) {
                impostoDeRenda = (salarioRoubus - 2000.0) * 0.08;
            } else if (salarioRoubus < 4500) {
                impostoDeRenda = (salarioRoubus - 3000.0) * 0.18 + 1000.0 * 0.08;
            } else{
                impostoDeRenda = (salarioRoubus - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            }
            
            if(impostoDeRenda == 0.0){
                JOptionPane.showMessageDialog(null, "Isento");
            }else{
                JOptionPane.showMessageDialog(null, valorFormat(impostoDeRenda));
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
    
    private static String valorFormat(double valor){
        String format = String.format("R$ %.2f", valor);
        return format;
    }
}
