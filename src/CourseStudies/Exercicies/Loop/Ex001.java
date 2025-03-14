package CourseStudies.Exercicies.Loop;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu curso (ADM, DIR, CEX): ");

        String curso = sc.nextLine();

        if (curso.equalsIgnoreCase("ADM")){
            System.out.println("ADMIN");
        } else if (curso.equalsIgnoreCase("DIR")) {
            System.out.println("DIREITO");
        } else if (curso.equalsIgnoreCase("CEX")){
            System.out.println("COMERCIO EXTERIOR");
        }
    }
}
