package CourseStudies.Exercicies.Loop;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        sc.nextLine();
        String op = sc.nextLine();

        if (op.equalsIgnoreCase("soma")){
            System.out.println(n1 + n2);
        } else if (op.equalsIgnoreCase("divisao")) {
            System.out.println(n1 / n2);
        } else if (op.equalsIgnoreCase("multi")) {
            System.out.println(n1 * n2);
        } else if (op.equalsIgnoreCase("sub")) {
            System.out.println(n1 - n2);
        }
    }
}
