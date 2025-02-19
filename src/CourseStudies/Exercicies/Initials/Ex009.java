package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotalSujo = sc.nextDouble();

        double valorDistribuidor = valorTotalSujo - (valorTotalSujo * 1.2);

        double valorTotalFinal = valorDistribuidor - (valorTotalSujo * 1.35);

        System.out.println("Valor Total final: " + valorTotalFinal);
    }
}
