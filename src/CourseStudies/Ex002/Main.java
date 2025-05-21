package Ex002;

import Ex002.models.Circulo;
import Ex002.models.Quadrado;
import Ex002.models.Retangulo;
import Ex002.models.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // chama o Scanner
        Scanner sc = new Scanner(System.in);
        int escolha = 1;
        // enquanto a escolha nao for 0, ele ira continuar, e comeca como 1 pois nao importa muito
        while(escolha != 0) {
            System.out.println("=== Escolha sua figura ===");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Triangulo");
            System.out.println("3 - Retangulo");
            System.out.println("4 - Circulo");
            System.out.println("0 - Sair");
            System.out.print("> ");
            escolha = sc.nextInt();

            if (escolha == 1) {
                // pergunta os dados e cria o construtor
                System.out.println(" --- Quadrado");

                System.out.println("Lado: ");
                double lado = sc.nextDouble();

                Quadrado quadrado = new Quadrado(lado);

                //Calcula e mostra
                System.out.println("Area TOTAL:");
                System.out.println(quadrado.CalcularArea());
            } else if (escolha == 2) {
                // pergunta os dados e cria o construtor
                System.out.println(" --- Triangulo");

                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                System.out.println("Base: ");
                double base = sc.nextDouble();

                Triangulo triangulo = new Triangulo(altura, base);

                // calcula a area
                System.out.println("Area TOTAL:");
                System.out.println(triangulo.CalcularArea());
            } else if (escolha == 3) {
                // pergunta os dados e cria o construtor
                System.out.println(" --- Retangulo");

                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                System.out.println("Base: ");
                double base = sc.nextDouble();

                Retangulo retangulo = new Retangulo(altura, base);

                // calcula a area
                System.out.println("Area TOTAL:");
                System.out.println(retangulo.CalcularArea());
            } else if (escolha == 4) {
                // pergunta os dados e cria o construtor
                System.out.println(" --- Circulo");

                System.out.println("Raio: ");
                double raio = sc.nextDouble();

                Circulo circulo = new Circulo(raio);

                // calcula a area
                System.out.println("Area TOTAL:");
                System.out.println(circulo.CalcularArea());
            } else { // Tratando erros
                System.out.println("Opção não existe");
                continue;
            }
        }
    }
}
