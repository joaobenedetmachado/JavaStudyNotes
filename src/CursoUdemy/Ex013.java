package CursoUdemy;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        double totalHoras, resultado;
        double Plano = 50.0;
        Scanner scanner = new Scanner(System.in);

        totalHoras = scanner.nextDouble();

        if (totalHoras <= 100) {
            System.out.println("Precisa pagar " + Plano);
        } else {
            resultado = (totalHoras - 100) * 2 + 50;
            System.out.println("Precisa pagar: " + resultado);
        }
    }
}
