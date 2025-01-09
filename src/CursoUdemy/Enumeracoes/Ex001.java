package CursoUdemy.Enumeracoes;

import java.util.Date;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Order order = new Order(110, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        Scanner sc = new Scanner(System.in);

        System.out.println("ID: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        Date nowmoment = new Date();
        System.out.println("Status: ");
        String status = sc.nextLine();

        Order order1 = new Order(id, nowmoment, OrderStatus.valueOf(status));
        System.out.println(order1);

    }
}
