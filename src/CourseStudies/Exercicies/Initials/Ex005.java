package CourseStudies.Exercicies.Initials;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double total = (base*altura)/2;

        System.out.println("Area total: " + total);
    }
}
