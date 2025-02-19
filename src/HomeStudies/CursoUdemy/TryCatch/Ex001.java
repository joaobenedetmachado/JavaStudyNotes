package CursoUdemy.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        method1();

        System.out.println("Fim do PROGRama");
    }

    public static void method1() {
        System.out.println("-*-*-*-*- INICIO DO METODO 1 -*-*-*-*-");
        Scanner sc = new Scanner(System.in);
        method2();
        sc.close();
        System.out.println("-*-*-*-*- FINAL DO METODO 1 -*-*-*-*-");
    }
    public static void method2() {
        System.out.println("-*-*-*-*- INICIO DO METODO 2 -*-*-*-*-");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro! posicao nao existe!");
            //e.printStackTrace(); // o print stack mostra onde que esta o erro e o caminho que o codigo levou ate chegar no erro
        } catch (InputMismatchException e) {
            System.out.println("Posicao nao encontrada, erro: " + e );
        }
        sc.close();
        System.out.println("-*-*-*-*- FINAL DO METODO 2 -*-*-*-*-");
    }
}
