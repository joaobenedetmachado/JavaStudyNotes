package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("produto: ");
        String produto = sc.nextLine();
        System.out.print("quantidade: ");
        Integer quantidade = sc.nextInt();
        sc.nextLine();
        System.out.print("preco: ");
        double preco = sc.nextDouble();
        double total = (quantidade * preco);
        System.out.println("Olá " + nome + ", o total deu: " + total);
    }
}
