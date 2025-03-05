package CourseStudies.Exercicies.Loop;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3){
            i++;
            System.out.println("Qual seu curso (ADM, DIR, CEX): ");

            String curso = sc.nextLine();

            if (curso.equalsIgnoreCase("ADM")){
                System.out.println("ADMIN");
            } else if (curso.equalsIgnoreCase("DIR")) {
                System.out.println("DIREITO");
            } else if (curso.equalsIgnoreCase("CEX")){
                System.out.println("COMERCIO EXTERIOR");
            }
        }
        }
    }

