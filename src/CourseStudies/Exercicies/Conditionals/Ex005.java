package CourseStudies.Exercicies.Conditionals;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextInt();

        if (salario <= 280.0) {
            System.out.println("Novo salario " + (salario * 1.2));
        } else if ( salario > 280 && salario < 700) {
            System.out.println("Novo salario " + (salario * 1.15));
        } else if ( salario >= 700 && salario < 1500) {
            System.out.println("Novo salario " + (salario * 1.1));
        } else if ( salario >= 1500 ) {
            System.out.println("Novo salario " + (salario * 1.05));
        }
    }
}
