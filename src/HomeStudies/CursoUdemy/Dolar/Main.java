package CursoUdemy.Dolar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o valor em reias para ser convertido: ");
        double valorEmReais = sc.nextDouble();
        cc.valorEmReais = valorEmReais;
        System.out.println(cc.GetValorEmDolar());



    }
}
