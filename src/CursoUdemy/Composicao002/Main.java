package CursoUdemy.Composicao002;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String r;

        do {
            LocalDate now = LocalDate.now();
            String title = sc.nextLine();
            String content = sc.nextLine();
            Post p1 = new Post(now, title, content);
            p1.addLikes();
            p1.addLikes();
            String comentContent = sc.nextLine();
            Coments c1 = new Coments(comentContent);
            p1.addComent(c1);
            System.out.println(p1);
            for (Coments x : p1.getListComents()) {
                System.out.println(x);
            }


            System.out.println("quer continuar?");
            r = sc.nextLine();
        } while (r.equals('s'));


    }
}
