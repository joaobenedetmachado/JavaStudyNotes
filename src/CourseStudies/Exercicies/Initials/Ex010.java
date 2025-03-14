package CourseStudies.Exercicies.Initials;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int totalNomes = 5;

        for (int i = 0; i < totalNomes; i++) {
            System.out.println("Nome " + i + ": ");
            list.add(sc.nextLine());
        }

        System.out.println(list);
        System.out.println(list.indexOf("joao"));
        System.out.println(list.get(1));
    }
}
