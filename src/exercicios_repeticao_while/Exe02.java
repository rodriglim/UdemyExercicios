package exercicios_repeticao_while;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Exe02 {

    private static String coordenadaTexto;

    public static void main(String[] args) {

        int coordenadaX, coordenadaY;

        coordenadaX = Integer.parseInt(JOptionPane.showInputDialog("Coordenada X: "));
        coordenadaY = Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y: "));
        
        try {
            while (!(coordenadaX == 0) && !(coordenadaY == 0)) {
                JOptionPane.showMessageDialog(null, validarCoordenadas(coordenadaX, coordenadaY));
                coordenadaX = Integer.parseInt(JOptionPane.showInputDialog("Coordenada X: "));
                coordenadaY = Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y: "));
            } 
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informações Inválidas");
        }

    }

    private static String validarCoordenadas(int coordenadaX, int coordenadaY) {
        if ((coordenadaX > 0) && (coordenadaY > 0)) {
            coordenadaTexto = "primeiro";
        } else if ((coordenadaX < 0) && (coordenadaY > 0)) {
            coordenadaTexto = "segundo";
        } else if ((coordenadaX < 0) && (coordenadaY < 0)) {
            coordenadaTexto = "terceiro";
        } else {
            coordenadaTexto = "quarta";
        }
        return coordenadaTexto;
    }
}
