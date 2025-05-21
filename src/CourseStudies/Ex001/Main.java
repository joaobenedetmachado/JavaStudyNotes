package Ex001;

import Ex001.models.CursoHibrido;
import Ex001.models.CursoOnline;
import Ex001.models.CursoPresencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nao precisava ter que chamar uma funcao nem nada, mas caso queira fazer mais alguma coisa é so colocar apos a funcao e tal

        showMenu();
    }

    // funcao de toda a logica
    public static void showMenu() {
        int escolha = 1;
        //enquanto nao for 0, ele continuara
        while (escolha != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==== MENU ====");
            System.out.println("1 - Cadastrar Curso Presencial");
            System.out.println("2 - Cadastrar Curso Online");
            System.out.println("3 - Cadastrar Curso Hibrido");
            System.out.println("0 - Sair");
            escolha = sc.nextInt();

            //mostra a escolha
            System.out.println("voce escolheu: " + escolha);

            if (escolha == 1) {
                // chama as informacoes e cadastra
                System.out.println("Cadastrando Novo Curso Presencial");
                System.out.println("Codigo: ");
                int codigo = sc.nextInt();
                System.out.println("Titulo: ");
                String titulo = sc.next();
                System.out.println("Nome Instrutor: ");
                String nome_instrutor = sc.next();
                System.out.println("Carga Horaria: ");
                int carga_horaria = sc.nextInt();
                System.out.println("Valor Base: ");
                double valor_base = sc.nextDouble();
                System.out.println("Capacidade: ");
                int capacidade = sc.nextInt();
                System.out.println("Sala");
                String sala = sc.next();

                CursoPresencial curso = new CursoPresencial(codigo,
                        titulo,
                        nome_instrutor,
                        carga_horaria,
                        valor_base,
                        capacidade,
                        sala);

                int NovaEscolha = 1;
                while (NovaEscolha != 0) {
                    System.out.println("=== Curso: " + titulo + " ===");
                    System.out.println("1 - Mostrar Informções");
                    System.out.println("2 - Calcular Custo");
                    System.out.println("0 - Sair");
                    NovaEscolha = sc.nextInt();
                    // aqui para as opcoes internas e tal
                    if (NovaEscolha == 1) {
                        System.out.println(curso.MostrarInformacoes());
                    } else if (NovaEscolha == 2) {
                        double custos = curso.CalcularCustos();
                        System.out.println(custos);
                    } else { // trata os erros, e acontece o mesmo no resto
                        System.out.println("Opção não existe");
                        continue;
                    }
                }

            }
            else if (escolha == 2) {
                //chama os dados para o construtor
                System.out.println("Cadastrando Novo Curso Online");
                System.out.println("Codigo: ");
                int codigo = sc.nextInt();
                System.out.println("Titulo: ");
                String titulo = sc.next();
                System.out.println("Nome Instrutor: ");
                String nome_instrutor = sc.next();
                System.out.println("Carga Horaria: ");
                int carga_horaria = sc.nextInt();
                System.out.println("Valor Base: ");
                double valor_base = sc.nextDouble();
                System.out.println("Plataforma: ");
                String plataforma = sc.next();
                System.out.println("Tempo de duração");
                int tempo_duracao = sc.nextInt();

                CursoOnline curso = new CursoOnline(codigo,
                        titulo,
                        nome_instrutor,
                        carga_horaria,
                        valor_base,
                        plataforma,
                        tempo_duracao);

                int NovaEscolha = 1;
                while (NovaEscolha != 0) {
                    System.out.println("=== Curso: " + titulo + " ===");
                    System.out.println("1 - Mostrar Informções");
                    System.out.println("2 - Calcular Custo");
                    System.out.println("0 - Sair");
                    NovaEscolha = sc.nextInt();
                    // aqui para as opcoes internas e tudo mais
                    if (NovaEscolha == 1) {
                        System.out.println(curso.MostrarInformacoes());
                    } else if (NovaEscolha == 2) {
                        double custos = curso.CalcularCustos();
                        System.out.println(custos);
                    } else { // trata os erros, e acontece o mesmo no resto
                        System.out.println("Opção não existe");
                        continue;
                    }
                }

            }
            else if (escolha == 3) {
                //chama os dados para o construtor
                System.out.println("Cadastrando Novo Curso Hibrido");
                System.out.println("Codigo: ");
                int codigo = sc.nextInt();
                System.out.println("Titulo: ");
                String titulo = sc.next();
                System.out.println("Nome Instrutor: ");
                String nome_instrutor = sc.next();
                System.out.println("Carga Horaria: ");
                int carga_horaria = sc.nextInt();
                System.out.println("Valor Base: ");
                double valor_base = sc.nextDouble();
                System.out.println("Dias na Semana: ");
                String dias_semana = sc.next();
                System.out.println("Numero de aulas");
                int nraulas = sc.nextInt();

                CursoHibrido curso = new CursoHibrido(codigo,
                        titulo,
                        nome_instrutor,
                        carga_horaria,
                        valor_base,
                        dias_semana,
                        nraulas);

                int NovaEscolha = 1;
                while (NovaEscolha != 0) {
                    System.out.println("=== Curso: " + titulo + " ===");
                    System.out.println("1 - Mostrar Informções");
                    System.out.println("2 - Calcular Custo");
                    System.out.println("0 - Sair");
                    NovaEscolha = sc.nextInt();
                    // aqui para as opcoes internas e tal
                    if (NovaEscolha == 1) {
                        System.out.println(curso.MostrarInformacoes());
                    } else if (NovaEscolha == 2) {
                        double custos = curso.CalcularCustos();
                        System.out.println(custos);
                    } else {
                        System.out.println("Opção não existe");
                        continue;
                    }
                }

            } else {
                System.out.println("Opção nao existe");
                continue;
            }
        }

    }
}