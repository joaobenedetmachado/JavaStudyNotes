package CursoUdemy.Vetores;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int n = sc.nextInt();
        sc.nextLine();

        Ex002Classe[] vetor = new Ex002Classe[n];

        for (int i = 0; i < n; i++) {
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            vetor[i] = new Ex002Classe(nome, price);
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vetor[i].getPrice();
        }
        System.out.println("MEDIA: " + sum / n );
    }
}
