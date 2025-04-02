package CourseStudies.Exercicies.MethodsWithArrays;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        double[] temperaturas = new double[10];

        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a Temperatura: ");
            temperaturas[i] = dados.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Temperaturas: " + temperaturas[i]);
        }
        dados.close();

    }

}

