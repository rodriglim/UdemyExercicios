package exercicios_condicionais;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe02 {
    
    public static void main(String[] args){
        
        int numero;
        
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
            
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "PAR");
            }else{
                JOptionPane.showMessageDialog(null, "ÍMPAR");
            }
            
        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
            
        }
    }
            
}
