package CursoUdemy;

import java.util.Scanner;

public class Ex023 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ensira o raio: ");
        double radius = scanner.nextDouble();

        double c = circunference(radius);
        double v = volume(radius);

        System.out.printf("Circunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);

    }
    public static double circunference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3;
    }
}
