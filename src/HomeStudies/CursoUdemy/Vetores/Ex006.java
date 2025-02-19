package CursoUdemy.Vetores;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Estudantes[] quartos = new Estudantes[10]; /* 10 quartos por padrao no caso*/

        for (int i = 0; i < n; i++) {
            System.out.println("RESERVA " + (i+ 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            int quarto = sc.nextInt();
            sc.nextLine();
            quartos[quarto] = new Estudantes(nome, email, quarto);
        }

        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i]);
            }
        }
    }
}
