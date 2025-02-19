package CursoUdemy;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        int diaDaSemana;
        Scanner scanner = new Scanner(System.in);
        diaDaSemana = scanner.nextInt();
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
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("erro");
                break;
        }
    }
}
