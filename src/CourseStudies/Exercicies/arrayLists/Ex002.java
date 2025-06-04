package CourseStudies.Exercicies.arrayLists;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cores = new String[5];

        for (int i = 0; i < cores.length; i++) {
            System.out.println("digite a cor n" + i);
            cores[i] = sc.next();
        }

        for (int i = 0; i < cores.length; i++) {
            System.out.println(cores[i]);

        }
    }
}
