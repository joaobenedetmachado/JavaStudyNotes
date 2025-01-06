package CursoUdemy.Vetores;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar");
        int i = sc.nextInt();
        int[] vetor = new int[i];

        for (int j = 0; j < i; j++) {
            System.out.print("NUMERO: ");
            vetor[j] = sc.nextInt();
        }

        System.out.println("numeros negativos: ");
        for (int j = 0; j < i; j++) {

            if (vetor[j] < 0 ) {
                System.out.println(vetor[j]);
            }
        }
    }
}
