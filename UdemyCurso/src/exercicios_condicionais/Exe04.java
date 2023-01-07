package exercicios_condicionais;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe04 {

    public static void main(String[] args) {

        int horaInicial, horaFinal, intervalo;

        try {
            horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial do Jogo: "));
            horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final do Jogo: "));

            if(horaFinal > horaInicial){
               intervalo = horaFinal - horaInicial ;
            }else{
                intervalo = 24 - horaInicial + horaFinal;
            }
            
            
            JOptionPane.showMessageDialog(null, "O jogo durou " + intervalo + "hora(s)");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
