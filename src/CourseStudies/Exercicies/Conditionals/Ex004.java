package CourseStudies.Exercicies.Conditionals;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaDaSemana = sc.nextInt();


        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.printf("Sexta");
                break;
            case 7:
                System.out.printf("Sabado");
                break;
            default:
                System.out.printf("dia nao existe");
                break;
        }


    }
}
