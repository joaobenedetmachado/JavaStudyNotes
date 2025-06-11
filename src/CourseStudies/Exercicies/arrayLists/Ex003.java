package CourseStudies.Exercicies.arrayLists;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];
        numeros[0] = 92;
        numeros[1] = 12;
        numeros[2] = 13;
        numeros[3] = 24;
        numeros[4] = 12;
        numeros[5] = 1;
        numeros[6] = 2;

        System.out.println("Qual numero deseja saber se esta na lista?: ");
        int escolha = sc.nextInt();

        boolean existe = false;

        for (int i = 0; i < numeros.length; i++) {
            if (escolha == numeros[i]) {
                existe = true;
            }
        }

        if (existe) {
            System.out.println("existe");
        } else {
            System.out.println("Nao existe");
        }
    }
}
