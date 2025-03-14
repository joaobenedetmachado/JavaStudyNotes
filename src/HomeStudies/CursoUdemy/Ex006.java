package CursoUdemy;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, resultado;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        resultado = (a * b) - (c * d);
        System.out.println(resultado);
        scanner.close();


    }
}
