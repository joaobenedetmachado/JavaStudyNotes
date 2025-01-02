package CursoUdemy;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        int idpedido, quantidade;
        Scanner scanner = new Scanner(System.in);

        idpedido = scanner.nextInt();
        quantidade = scanner.nextInt();

        if (idpedido == 1){
            System.out.println("Total : " + (4.00 * quantidade));
        } else if (idpedido == 2) {
            System.out.println("Total : " + (4.50 * quantidade));
        } else if (idpedido == 3) {
            System.out.println("Total : " + (5.00 * quantidade));
        }
    }
}
