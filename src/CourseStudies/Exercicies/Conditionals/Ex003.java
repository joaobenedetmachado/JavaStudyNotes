package CourseStudies.Exercicies.Conditionals;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int media = (n1 + n2)/2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if ( media < 7) {
            System.out.printf("Reprovado ou recuperação");
        }

    }
}
