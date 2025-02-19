package CursoUdemy;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("multiplo");
        } else {
            System.out.println("nao é multiplo");
        }
    }
}
