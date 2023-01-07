package exercicios_condicionais;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe01 {
    
    public static void main(String[] args){
        
        int numero;
        
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
            
            if(numero >= 0){
                JOptionPane.showMessageDialog(null, "Não Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Negativo");
            }
            
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas!");
        }
    }
}
