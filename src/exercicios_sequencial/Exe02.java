package exercicios_sequencial;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe02 {
    
    public static void main(String[] args){
        
        Scanner lScanner = new Scanner(System.in);
        
        final float VALOR_DE_PI = 3.14f;
        float raioCirculo, area;
        
        try {
            
            raioCirculo = Float.parseFloat(JOptionPane.showInputDialog("Informe o raío do círculo: "));
            area = (VALOR_DE_PI * (float) Math.pow(raioCirculo, 2));
            JOptionPane.showMessageDialog(null, "A = " + area);
   
        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Valores Inválidos! Tente Novamente");
            
        }
    }
}
