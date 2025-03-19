package atividades.ex004;

import java.util.Scanner;

public class Main {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        //chama o scanner e tal
        Scanner sc = new Scanner(System.in);
        //incia o while
        while (true) {
            System.out.print("Insira o raio: ");
            double raio = sc.nextDouble();

            //calcula o que precisa
            double perimetro = raio * PI;
            double area = PI * raio * raio;


            //insere na classe
            Circulo circulo = new Circulo(raio, perimetro, area);

            System.out.println("Perimetro: " + circulo.getPerimetro());
            System.out.println("Area: " + circulo.getArea());


            // pergunta pra ver se deseja continuar
            System.out.println("Deseja continuar? [S/N] ");
            sc.nextLine();
            String resposta = sc.nextLine();
            if ( resposta.equals("N")) {
                break;
            }
        }
    }
}
