package atividades.ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inicia as variaveis
        int TotalM = 0;
        int TotalF = 0;
        double totalPesoF = 0;
        double totalPesoM = 0;
        double menorAltura = 0;
        double maiorAltura = 0;

        //executa 20 vezes
        int i = 0;
        while (i < 20){
            i++;
            // incrementa na variavel de gancho e pegas as variavies
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            System.out.println("Peso: ");
            double peso = sc.nextDouble();
            System.out.println("Sexo [F/M]");
            sc.nextLine();
            String sexo = sc.nextLine();
            Pessoa pessoa = new Pessoa(altura, peso, sexo);

            // faz os if's, caso seja F, aumenta o numero de mulheres, aumenta o total do peso, e assim vai, para os homens é a mesma coisa porem para as variaveis deles
            if (pessoa.getSexo().equals("F")) {
                TotalF++;
                totalPesoF = totalPesoF + pessoa.getPeso();
                if (menorAltura > pessoa.getAltura()) {
                    menorAltura = pessoa.getAltura();
                } else if (maiorAltura < pessoa.getAltura()) {
                    maiorAltura = pessoa.getAltura();
                }
            } else if (pessoa.getSexo().equals("M")) {
                TotalM++;
                totalPesoM = totalPesoM + pessoa.getPeso();
                if (menorAltura < pessoa.getAltura()) {
                    menorAltura = pessoa.getAltura();
                } else if (maiorAltura < pessoa.getAltura()) {
                    maiorAltura = pessoa.getAltura();
                }
            }
        }

        System.out.println("MAIOR ALTURA: " + maiorAltura);
        System.out.println("MENOR ALTURA: " + menorAltura);
        System.out.println("MEDIA PESO MULHERES: " + (totalPesoF / TotalF));
        System.out.println("MULHERES CADASTRADAS: " + TotalF);
        System.out.println("HOMENS CADASTRADOS " + TotalM);

    }
}
