package CursoUdemy.Vetores;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();
        double[] vetor = new double[numeros];
        sc.nextLine();
        for (int i = 0; i < numeros; i++) {
            System.out.print("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < numeros ; i++) {
            soma += vetor[i];
        }
        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + soma/numeros);
    }
}
