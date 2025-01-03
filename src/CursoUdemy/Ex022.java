package CursoUdemy;

import java.util.Scanner;

public class Ex022{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = findHigher(a, b, c);
        Print(maior);
    }

    public static int findHigher(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
           return c;
        }
    }
    public static void Print(int a) {
        System.out.println("maior: " + a);
    }
}
