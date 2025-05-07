package CourseStudies.Exercicies.Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Listar Veículos");
            System.out.println("4. Executar método em veículo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    veiculos.add(cadastrarVeiculo(scanner, "carro"));
                    break;
                case 2:
                    veiculos.add(cadastrarVeiculo(scanner, "moto"));
                    break;
                case 3:
                    listarVeiculos(veiculos);
                    break;
                case 4:
                    executarMetodo(veiculos, scanner);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private static Veiculo cadastrarVeiculo(Scanner scanner, String tipo) {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        if (tipo.equals("carro")) {
            return new Carro(codigo, marca, modelo, ano, peso);
        } else {
            return new Moto(codigo, marca, modelo, ano, peso);
        }
    }

    private static void listarVeiculos(List<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(i + ": " + veiculos.get(i));
        }
    }

    private static void executarMetodo(List<Veiculo> veiculos, Scanner scanner) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        listarVeiculos(veiculos);
        System.out.print("Escolha o índice do veículo: ");
        int idx = scanner.nextInt();
        scanner.nextLine();
        if (idx < 0 || idx >= veiculos.size()) {
            System.out.println("Índice inválido!");
            return;
        }
        Veiculo v = veiculos.get(idx);
        System.out.println("Escolha o método:");
        System.out.println("1. Revisao");
        System.out.println("2. Manutencao");
        System.out.println("3. Limpeza");
        System.out.println("4. Abastecimento");
        System.out.print("Opção: ");
        int metodo = scanner.nextInt();
        scanner.nextLine();
        switch (metodo) {
            case 1: v.Revisao(); break;
            case 2: v.Manutencao(); break;
            case 3: v.Limpeza(); break;
            case 4: v.Abastecimento(); break;
            default: System.out.println("Método inválido!");
        }
    }
}
