package CourseStudies.Exercicies.MethodsWithArrays;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] listaNumeros = new int[5];

        for (int i = 0; i < listaNumeros.length; i++) {
            int number = sc.nextInt();
            listaNumeros[i] = number;
        }

        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] % 2 == 0) {
                System.out.println(listaNumeros[i]);
            }
        }
    }
}
