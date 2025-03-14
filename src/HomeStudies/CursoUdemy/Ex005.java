package CursoUdemy;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        double pi = 3.14159;
        double resultado;
        a = scanner.nextInt();
        resultado = (a*a)*pi;
        System.out.println(resultado);
        scanner.close();
    }
}
