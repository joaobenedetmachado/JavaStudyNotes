package CursoUdemy;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        int quantidade, numeros;
        int in = 0;
        int out = 0;
        Scanner sc = new Scanner(System.in);
        quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            numeros = sc.nextInt();
            if (numeros > 20 || numeros < 10) {
                out++;
            } else if (numeros >= 10 && numeros <= 20) {
                in++;
            }
        }
        System.out.println(out + " out");
        System.out.println(in + " in");
    }
}
