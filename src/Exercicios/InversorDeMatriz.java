package Exercicios;

import java.util.Scanner;

public class InversorDeMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int[][] matrizReversao = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matriz reversa: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][n - 1 - j];
                matriz[i][n - 1 - j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



    }
}
