package CursoUdemy;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        int number, hora;
        double valuePerHour;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        hora = scanner.nextInt();
        scanner.nextLine();
        valuePerHour = scanner.nextDouble();
        System.out.println("Number = " + number);
        System.out.println("Salary = " + (hora * valuePerHour));
        scanner.close();
    }
}
