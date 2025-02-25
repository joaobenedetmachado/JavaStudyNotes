package CourseStudies.Exercicies.Conditionals;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n1 = sc.nextInt();
        Integer n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Numero 1 é maior");
        } else if (n2 > n1) {
            System.out.println("Numero 2 é maior");
        } else {
            System.out.printf("Ambos são iguais");
        }
    }
}
