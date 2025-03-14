package CursoUdemy;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a, b, c;

        a = scanner.nextLine();
        b = scanner.nextLine();
        c = scanner.nextLine();

        System.out.println("Dados digitados: ");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scanner.close();
    }
}
