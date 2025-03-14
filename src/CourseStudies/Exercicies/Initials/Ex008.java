package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double valorHora = sc.nextDouble();
        Integer totalHorasMensal = sc.nextInt();

        double totalSujo = valorHora * totalHorasMensal;
        double totalLimpo = totalSujo * 0.98;

        System.out.println("Ola " + nome + " total mensal: " +  totalLimpo);
    }


}
