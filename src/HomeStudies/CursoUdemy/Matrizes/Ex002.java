package CursoUdemy.Matrizes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insiria o numero de linhas: ");
        int n = sc.nextInt();
        System.out.print("Insira o numero de colunas: ");
        int m = sc.nextInt();


        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("pegar informacoes de quais numeros: ");
        int numero = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("EM CIMA: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("EM BAIXO: " + matriz[i+1][j]);
                    }

                }
            }
        }
    }
}
