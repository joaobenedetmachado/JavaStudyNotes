package CourseStudies.Exercicies.Methods;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int menorDeIdade = 0;
        int maiorDeIdade = 0;
        while (i<3) {
            i++;

            Integer idade = sc.nextInt();

            if (VerificarIdade(idade).equals("MaiorDeIdade")) {
                maiorDeIdade++;
            } else {
                menorDeIdade++;
            }

        }

    }

    public static String VerificarIdade(Integer idade) {
        if (idade >= 18) {
            return "MaiorDeIdade";
        } return "MenorDeIdade";
    }
}
