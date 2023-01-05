package repeticao;

import java.util.Scanner;

public class Exercicio_While {

    public static void main(String[] args) {

        try (Scanner lScanner = new Scanner(System.in)) {
            
            int n, soma = 0, i = 1;
            System.out.print("1ª número inteiro: ");
            n = lScanner.nextInt();
            
            while (!(n == 0)) {
                i++;
                soma+=n;
                System.out.printf("%dª número inteiro: ", i);
                n = lScanner.nextInt();
            }   
            
            System.out.println("A soma é " + soma);
            lScanner.close();
        }
    }
}
