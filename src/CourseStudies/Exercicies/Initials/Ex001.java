package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nome: ");
        String nome = sc.nextLine();

        System.out.println("endereco: ");
        String endereco = sc.nextLine();

        System.out.println("bairro: ");
        String bairro = sc.nextLine();

        System.out.println("cidade: ");
        String cidade = sc.nextLine();

        System.out.println("estado: ");
        String estado = sc.nextLine();

        System.out.println("nome: " + nome + " endereco: " +  endereco + " bairro: " + bairro + " cidade " + cidade );
    }
}
