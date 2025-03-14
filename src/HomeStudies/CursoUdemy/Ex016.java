package CursoUdemy;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    x = sc.nextInt();
    while (x != 2025) {
        System.out.println("senha errada");
        x = sc.nextInt();
    }
        System.out.println("senha certa");
    }
}
