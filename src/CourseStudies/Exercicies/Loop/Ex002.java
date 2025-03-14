package CourseStudies.Exercicies.Loop;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual seu estado civil (S, C, V, D): ");

        String curso = sc.nextLine();

        if (curso.equalsIgnoreCase("S")){
            System.out.println("SOLTEIRO");
        } else if (curso.equalsIgnoreCase("C")) {
            System.out.println("CASADO");
        } else if (curso.equalsIgnoreCase("V")){
            System.out.println("VIUVO");
        } else if (curso.equalsIgnoreCase("D")) {
            System.out.println("DIVORCIADO");
        }
    }
}
