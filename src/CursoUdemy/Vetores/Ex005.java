package CursoUdemy.Vetores;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] vetorDePessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            vetorDePessoas[i] = new Pessoa(nome,altura,idade);
        }
        double somaAltura = 0;
        double somaIdade = 0;
        for (int i = 0; i < n; i++) {
            somaAltura += vetorDePessoas[i].getAltura();
            somaIdade += vetorDePessoas[i].getIdade();
        }
        System.out.println("MEDIA IDADE: " + (somaIdade / n));
        System.out.println("MEDIA ALTURA: " + (somaAltura / n));
    }
}
