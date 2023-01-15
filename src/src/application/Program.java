package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lScanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = lScanner.nextDouble();
        x.b = lScanner.nextDouble();
        x.c = lScanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = lScanner.nextDouble();
        y.b = lScanner.nextDouble();
        y.c = lScanner.nextDouble();

        double xArea = x.calcularArea();
        double yArea = y.calcularArea();
        
        System.out.printf("Triangle X area: %.4f%n", xArea);
        System.out.printf("Triangle Y area: %.4f%n", yArea);
      
        System.out.println(xArea < yArea ? "Large area: Y" : "Larger area: X");
    
        lScanner.close();
    }
}
