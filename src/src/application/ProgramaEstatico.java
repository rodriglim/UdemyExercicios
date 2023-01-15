package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class ProgramaEstatico {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double raio = lScanner.nextDouble();
        double c = Calculator.circuferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circuferência %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("PI %.2f%n", Calculator.PI);

    }

}
