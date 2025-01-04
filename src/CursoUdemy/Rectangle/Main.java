package CursoUdemy.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        r1.height = sc.nextDouble();
        r1.width = sc.nextDouble();
        System.out.println(r1);

    }
}
