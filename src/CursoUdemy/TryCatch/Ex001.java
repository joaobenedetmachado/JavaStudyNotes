package CursoUdemy.TryCatch;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro! posicao nao existe!");
        }

        System.out.println("Fim do PROGRama");
        sc.close();
    }
}
