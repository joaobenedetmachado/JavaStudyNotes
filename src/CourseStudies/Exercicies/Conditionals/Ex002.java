package CourseStudies.Exercicies.Conditionals;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        if ( p1 < p2 && p1 < p3) {
            System.out.println("O produto 1 é o mais barato");
        } else if ( p2 < p1 && p2 < p3) {
            System.out.println("O produto 2 é o mais barato");
        } else if (p3 < p1 && p3 < p2) {
            System.out.println("O produto 3 é o mais barato");
        }
    }
}
