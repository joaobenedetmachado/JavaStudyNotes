package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        double salarioAumentado = salario * 1.05;

        System.out.println("Olá " + nome +" Salario aumentado de " + salario + " para: " + salarioAumentado);


    }
}
