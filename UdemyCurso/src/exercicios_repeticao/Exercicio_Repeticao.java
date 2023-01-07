package exercicios_repeticao;

import com.sun.glass.ui.Cursor;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exercicio_Repeticao {
    
    public static void main(String[] args) {
        
        final String SENHA_USUARIO = "2002";
        String senhaInformada;
        
        try {
            do {                
                senhaInformada = JOptionPane.showInputDialog("Entre com uma senha: "); 
                if(senhaInformada.equals(SENHA_USUARIO)){
                    JOptionPane.showMessageDialog(null, "Acesso Autorizado!");
                }else{
                    JOptionPane.showMessageDialog(null, "Acesso Negado");
                    
                }
            } while (!senhaInformada.equals(SENHA_USUARIO));
           
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Valores Inválidos");
        }
    }
}
