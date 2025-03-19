package atividades.ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer bercario = 0;
        Integer infantil = 0;
        Integer fund1 = 0;
        Integer fund2 = 0;
        Integer ensinoMedio = 0;


        while (true) {
            System.out.print("Qual Seu nome [PARA SAIR DIGITE (SAIR)]: " );
            String nome = sc.nextLine();
            System.out.print("Qual sua idade: ");
            Integer idade = sc.nextInt();

            Aluno aluno = new Aluno(nome, idade);

            if (nome.equals("SAIR")) {
                sc.close();
                break;
            } else {
                if (aluno.getIdade() >= 0 && aluno.getIdade() <= 3) {
                    aluno.setCategoria("Berçario");
                    bercario++;
                } else if (aluno.getIdade() >= 4 && aluno.getIdade() <= 7) {
                    aluno.setCategoria("Infantil");
                    infantil++;
                } else if (aluno.getIdade() >= 8 && aluno.getIdade() <= 11) {
                    aluno.setCategoria("Fundamental |");
                    fund1++;
                } else if (aluno.getIdade() >= 12 && aluno.getIdade() <= 14) {
                    aluno.setCategoria("Fundamental ||");
                    fund2++;
                } else if (aluno.getIdade() >= 15) {
                    aluno.setCategoria("Ensino Médio");
                    ensinoMedio++;
                }
            }

            System.out.println(aluno.getCategoria());
            sc.nextLine();
        }
        System.out.println("TOTAL BERCARIO: " + bercario);
        System.out.println("TOTAL INFANTIL: " + infantil);
        System.out.println("TOTAL FUNDAMENTAL |: " + fund1);
        System.out.println("TOTAL FUNDAMENTAL ||: " + fund2);
        System.out.println("TOTAL ENSINO MEDIO: " + ensinoMedio);
    }
}
