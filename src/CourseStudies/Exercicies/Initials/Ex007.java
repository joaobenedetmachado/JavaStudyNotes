package CourseStudies.Exercicies.Initials;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Integer totalAcentos = 80;
        double precoIngresso = 20.0;
        Integer totalSessaoDias = 3;

        double totalDiario = totalAcentos * precoIngresso * 3;
        System.out.println("total diario: " + totalDiario);
        System.out.println("total semanal: " + totalDiario * 7);
        System.out.println("total mensal: " + totalDiario * 30);
    }
}
