package CourseStudies.Exercicies.MethodsWithArrays;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        String[] especialidade = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: ");
            String nomeTemp = sc.nextLine();
            System.out.println("Salario: ");
            String especialidadetemp = sc.nextLine();
            nome[i] = nomeTemp;
            especialidade[i] = especialidadetemp;
        }

        for (int i = 0; i < especialidade.length; i++) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Salario: " + especialidade[i]);

        }
    }
}
