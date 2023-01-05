package condicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            int hora;
            
            System.out.println("Quantas Horas? ");
            hora = s.nextInt();
            
            
            if (hora < 12) {
                System.out.println("Bom Dia");
            }else if(hora < 18){
                System.out.println("Boa Tarde");
            }else{
                System.out.println("Boa Noite");
            }
        }
    }
}
