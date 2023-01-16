package matrizes;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        System.out.println("N: ");
        int n = lScanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lScanner.nextInt();
            }
        }

        for (int matrizLinha = 0; matrizLinha < matriz.length; matrizLinha++) {
            for (int matrizColuna = 0; matrizColuna < matriz.length; matrizColuna++) {
                System.out.print(matriz[matrizLinha][matrizColuna] + " ");
            }
            System.out.println("");
        }

        int qtdNegativos = 0;
        System.out.println("Diagonais Principais: ");
        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz[k].length; l++) {
                if (k == l) {
                    System.out.print(matriz[k][l] + " ");
                }
                if (matriz[k][l] < 0) {
                    qtdNegativos++;
                }
            }
        }
        
        System.out.println("\nNúmeros Negativos = " + qtdNegativos);
    }
}
