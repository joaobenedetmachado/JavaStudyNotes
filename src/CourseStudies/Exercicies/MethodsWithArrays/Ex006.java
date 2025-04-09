package CourseStudies.Exercicies.MethodsWithArrays;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        String[] salario = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: ");
            String nomeTemp = sc.nextLine();
            System.out.println("Salario: ");
            String salarioTemp = sc.nextLine();
            nome[i] = nomeTemp;
            salario[i] = salarioTemp;
        }

        for (int i = 0; i < salario.length; i++) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Salario: " + salario[i]);

        }
    }
}
