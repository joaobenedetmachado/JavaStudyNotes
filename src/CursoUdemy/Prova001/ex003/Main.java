package atividades.ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // faz as perguntas e inicia as variaveis
            System.out.print("Numero da conta:");
            Integer numeroConta = sc.nextInt();

            System.out.print("Seu nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Saldo: ");
            Double saldoConta = sc.nextDouble();

            Cliente cliente = new Cliente(numeroConta, nome, saldoConta);

            //if's aqui e coloca na classe do cliente
            if (cliente.getSaldoConta() >= 0 && cliente.getSaldoConta() <= 2000) {
                System.out.println("Nao possui saldo para credito.");
            } else if (cliente.getSaldoConta() >= 2001 && cliente.getSaldoConta() <= 4000){
                double saldoCliente = cliente.getSaldoConta();
                double novoSaldo = saldoCliente * 1.05;

                cliente.setSaldoConta(novoSaldo);
            }else if (cliente.getSaldoConta() >= 4001 && cliente.getSaldoConta() <= 6000){
                double saldoCliente = cliente.getSaldoConta();
                double novoSaldo = saldoCliente * 1.10;

                cliente.setSaldoConta(novoSaldo);
            }else if (cliente.getSaldoConta() > 6000){
                double saldoCliente = cliente.getSaldoConta();
                double novoSaldo = saldoCliente * 1.15;

                cliente.setSaldoConta(novoSaldo);
            }

            //informa as infos
            System.out.println("Olá " + cliente.getNome());
            System.out.println("seu novo saldo é: " + cliente.getSaldoConta());


            //se deseja continuar ele nao entra no if e nao sai
            System.out.println("Deseja continuar? [S/N] ");
            sc.nextLine();
            String resposta = sc.nextLine();
            if ( resposta.equals("N")) {
                break;
            }
        }
    }
}
