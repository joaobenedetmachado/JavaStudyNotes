package CourseStudies.Exercicies.MethodsWithArrays;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o numero: ");
            numero[i] = sc.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] >= 0) {
                System.out.println("Positivoi");
            } else {
                System.out.println("Negativo");
            }
        }
    }
}
