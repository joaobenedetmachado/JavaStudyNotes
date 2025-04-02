package CourseStudies.Exercicies.MethodsWithArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja adcionar quantas pessoas?: ");
        int n = sc.nextInt();

        String[] pessoas = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nome da pessoa " + i);
            pessoas[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(pessoas[i]);
        }

        System.out.println("Deseja encontrar que pessoa?: ");
        String nomeDaPessoa = sc.nextLine();

        boolean pessoaExiste = false;
        for (int i = 0; i < n; i++) {
            if (nomeDaPessoa.equals(pessoas[i])) {
                pessoaExiste = true;
            }
        }

        if (pessoaExiste == true) {
            System.out.println("Existe");
        } else{
            System.out.println("N existe");
        }

        sc.close();
    }
}
