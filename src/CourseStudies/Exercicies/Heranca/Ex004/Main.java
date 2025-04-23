package CourseStudies.Exercicies.Heranca.Ex004;

import CourseStudies.Exercicies.Heranca.Ex002.Peixe;
import CourseStudies.Exercicies.Heranca.Ex003.Mamifero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastrar peixe ou mamifero");

        String escolha = sc.next();

        if (escolha.equals("peixe")) {
            String nome = sc.next();
            Double comprimento = sc.nextDouble();
            Integer numeroDePatas = sc.nextInt();
            String cor = sc.next();
            String ambiente = sc.next();
            Double veloMedia = sc.nextDouble();
            String carac = sc.next();

            Peixe peixe = new Peixe(nome,comprimento, numeroDePatas, cor, ambiente, veloMedia, carac);

            System.out.println(peixe);

        } else if (escolha.equals("mamifero")) {
            String nome = sc.next();
            Double comprimento = sc.nextDouble();
            Integer numeroDePatas = sc.nextInt();
            String cor = sc.next();
            String ambiente = sc.next();
            Double veloMedia = sc.nextDouble();
            String alimento = sc.next();

            Mamifero mamifero = new Mamifero(nome,comprimento, numeroDePatas, cor, ambiente, veloMedia, alimento);

            System.out.println(mamifero);
        } else {
            System.out.println("NAO ENCONTRADO");
        }


    }
}
