package CursoUdemy.Vetores;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        int n = sc.nextInt();
        double[] vetor = new double[n];

        sc.nextLine();

        for (int j = 0; j < n; j++) {
            vetor[j] = sc.nextDouble();
        }
        for (int j = 0; j < n; j++) {
            total += vetor[j];
        }

        System.out.printf("MEDIA: %.2f\n", (total/n));

    }
}
