package CourseStudies.Exercicies.MethodsWithArrays;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] listaNumeros = new int[5];

        for (int i = 0; i < listaNumeros.length; i++) {
          int number = sc.nextInt();
          listaNumeros[i] = number;
        }

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }
    }
}
