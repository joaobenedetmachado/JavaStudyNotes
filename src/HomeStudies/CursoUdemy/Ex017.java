package CursoUdemy;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        double eixoX, eixoY;
        Scanner scanner = new Scanner(System.in);
        eixoX = scanner.nextDouble();
        eixoY = scanner.nextDouble();

        while (eixoX != 0 && eixoY != 0) {
            if (eixoX > 0 && eixoY > 0) {
                System.out.println("Q1");
            } else if (eixoX > 0 && eixoY < 0) {
                System.out.println("Q4");
            } else if (eixoX < 0 && eixoY < 0) {
                System.out.println("Q3");
            } else if (eixoX < 0 && eixoY > 0) {
                System.out.println("Q2");
            }
            eixoX = scanner.nextDouble();
            eixoY = scanner.nextDouble();
        }
        System.out.println("sai");
    }
}
