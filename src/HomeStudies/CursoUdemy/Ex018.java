package CursoUdemy;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            if (i %  2 != 0) {
                System.out.println(i);
            }
        }

    }
}
