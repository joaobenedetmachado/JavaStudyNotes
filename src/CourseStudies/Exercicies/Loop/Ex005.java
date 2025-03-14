package CourseStudies.Exercicies.Loop;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 30) {
            i++;

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int media = (n1 + n2)/2;

            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media == 10) {
                System.out.println("Aprovado com distinção");
            } else if ( media < 7) {
                System.out.println("Reprovado ou recuperação");
            }
        }
    }
}
