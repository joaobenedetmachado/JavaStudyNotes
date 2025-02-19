package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("nome: ");
        String nome = sc.nextLine();

        System.out.println("curso: ");
        String curso = sc.nextLine();

        System.out.println("Nota1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("MEDIA: " + media);
    }
}
