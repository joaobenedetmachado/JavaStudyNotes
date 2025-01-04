package CursoUdemy.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario user1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Name:");
        String nome = sc.nextLine().trim();
        System.out.print("Is there a inital deposit? [Y/N]");
        String InitialDeposito = sc.nextLine();
        if (InitialDeposito.equals("N")) {
            user1 = new Usuario(ID, nome);
        } else {
            System.out.print("Enter your initial deposit: ");
            double value = sc.nextDouble();
            user1 = new Usuario(ID, nome, value);
        }
        System.out.println(user1);
        System.out.print("Enter um valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        user1.addValue(valorDeposito);
        System.out.println(user1);
        System.out.print("Enter um valor para retirar: ");
        double valorRetiro = sc.nextDouble();
        user1.removeValue(valorRetiro);
        System.out.println(user1);
    }
}
