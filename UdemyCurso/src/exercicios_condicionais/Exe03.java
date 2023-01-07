package exercicios_condicionais;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe03 {
    
    public static void main(String[] args){
        
        int numeroA, numeroB;
        
        try {
            numeroA = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
            numeroB = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
            
            boolean multiplos = ((numeroA % numeroB == 0) || (numeroB % numeroA == 0));
            
            if(multiplos){
                JOptionPane.showMessageDialog(null, "São Multiplos");
            }else{
                JOptionPane.showMessageDialog(null, "Não são multiplos");
            }
            
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }
    }
}
