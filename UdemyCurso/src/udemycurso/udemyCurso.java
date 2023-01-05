package udemycurso;

import java.util.Locale;

class UdemyCurso {

    public static void main(String[] args) {

        // System.out.println("Olá, Mundo!");
        
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        
    }

}
