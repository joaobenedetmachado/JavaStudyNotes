package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double total = peso/(altura * altura);

        System.out.println("Total: " + total);
    }
}
