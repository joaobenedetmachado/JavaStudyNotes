package exercicio_2;

import exercicio_2.models.CalibracaoPneus;
import exercicio_2.models.Limpeza;
import exercicio_2.models.TrocaOleo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MENU();
    }

    public static void MENU() {
        Scanner sc = new Scanner(System.in); // crio o scanner
        ArrayList<Limpeza> ListaLimpeza = new ArrayList<>(); // crio as listas
        ArrayList<TrocaOleo> ListaTrocaOleo = new ArrayList<>();
        ArrayList<CalibracaoPneus> ListaCalibracaoPneus = new ArrayList<>();

        while (true) { // funcao para sempre rodar e mostrar o menu
            System.out.println("=== MENU OFICINA ===");
            System.out.println("1 - Cadastrar Servicos ");
            System.out.println("2 - Exibir Informações ");
            System.out.println("3 - Sair");

            String escolha = sc.next();

            if (escolha.equals("1")) { // opcoes e tal
                System.out.println("1 - Limpeza");
                System.out.println("2 - Troca de Oleo");
                System.out.println("3 - Calibração de Pneu");

                String escolhaServicos = sc.next();

                if (escolhaServicos.equals("1")) { // cadastrar limpeza
                    System.out.println("Cadastrando nova limpeza");
                    System.out.println("Codigo: ");
                    Integer codigo = sc.nextInt();
                    System.out.println("Descrição: ");
                    sc.nextLine();
                    String desc = sc.nextLine();
                    System.out.println("Tecnico Responsavel: ");
                    String tecnico = sc.nextLine();
                    System.out.println("Tipo: ");
                    String tipo =  sc.nextLine();
                    System.out.println("Tempo de duração: ");
                    Double tempo = sc.nextDouble();
                    System.out.println("Valor mão de obra: ");
                    Double valormaodeobra = sc.nextDouble();

                    //variavel temporaria
                    Limpeza temp = new Limpeza(codigo, desc, tecnico, tipo, tempo, valormaodeobra);

                    ListaLimpeza.add(temp); // adciona a variavel temporaria

                    System.out.println("Nova Limpeza Cadastrada: ");
                    System.out.println("Codigo - " + temp.getCodigo());
                    System.out.println("Descrição - " + temp.getDescricao());
                    System.out.println("Tecnico - " + temp.getTecnico_responsavel());
                    System.out.println("Tipo - " + temp.getTipo());
                    System.out.println("Tempo Duração - " + temp.getTempo_duracao());
                    System.out.println("Valor mão de obra - " + temp.getValor());
                    System.out.println(" === VALOR TOTAL ===");
                    System.out.println(temp.CalcularValorTotal()); // aqui chama a funcao do polimorfismo

                } else if (escolhaServicos.equals("2")) { // para cadastrar oleo
                    System.out.println("Cadastrando nova Troca de oleo");
                    System.out.println("Codigo: ");
                    Integer codigo = sc.nextInt();
                    System.out.println("Descrição: ");
                    sc.nextLine();
                    String desc = sc.nextLine();
                    System.out.println("Tecnico Responsavel: ");
                    String tecnico = sc.nextLine();
                    System.out.println("Marca: ");
                    String marca =  sc.nextLine();
                    System.out.println("Tempo de duração: ");
                    Double tempo = sc.nextDouble();
                    System.out.println("Valor mão de obra: ");
                    Double valormaodeobra = sc.nextDouble();

                    //variavel temporaria
                    TrocaOleo temp = new TrocaOleo(codigo, desc, tecnico, marca, tempo, valormaodeobra);

                    ListaTrocaOleo.add(temp);

                    System.out.println("Nova Troca de Oleo Cadastrada: "); // mostra oque foi criado e tal
                    System.out.println("Codigo - " + temp.getCodigo());
                    System.out.println("Descrição - " + temp.getDescricao());
                    System.out.println("Tecnico - " + temp.getTecnico_responsavel());
                    System.out.println("Marca - " + temp.getMarca());
                    System.out.println("Tempo Duração - " + temp.getTempo_duracao());
                    System.out.println("Valor mão de obra - " + temp.getValor());
                    System.out.println(" === VALOR TOTAL ===");
                    System.out.println(temp.CalcularValorTotal()); // aqui chama a funcao do polimorfismo

                } else if (escolhaServicos.equals("3")) { // para calibrar pneus
                    System.out.println("Cadastrando nova Calibração de Pneu");
                    System.out.println("Codigo: ");
                    Integer codigo = sc.nextInt();
                    System.out.println("Descrição: ");
                    sc.nextLine();
                    String desc = sc.nextLine();
                    System.out.println("Tecnico Responsavel: ");
                    String tecnico = sc.nextLine();
                    System.out.println("Formato: ");
                    String formato =  sc.nextLine();
                    System.out.println("Tempo de duração: ");
                    Double tempo = sc.nextDouble();
                    System.out.println("Valor mão de obra: ");
                    Double valormaodeobra = sc.nextDouble();

                    //variavel temporaria
                    CalibracaoPneus temp = new CalibracaoPneus(codigo, desc, tecnico, formato, tempo, valormaodeobra);

                    ListaCalibracaoPneus.add(temp);

                    System.out.println("Nova Calibração Cadastrada: "); // so mostra que foi cadastrado mesmo
                    System.out.println("Codigo - " + temp.getCodigo());
                    System.out.println("Descrição - " + temp.getDescricao());
                    System.out.println("Tecnico - " + temp.getTecnico_responsavel());
                    System.out.println("Formato - " + temp.getFormato());
                    System.out.println("Tempo Duração - " + temp.getTempo_duracao());
                    System.out.println("Valor mão de obra - " + temp.getValor());
                    System.out.println(" === VALOR TOTAL ===");
                    System.out.println(temp.CalcularValorTotal()); // aqui chama a funcao do polimorfismo
                } else {
                    System.out.println("Nao existe essa opcao");
                }

            } else if (escolha.equals("2")) { // funcao para exibir tudo
                System.out.println("EXIBINDO TODAS AS LIMPEZAS FEITAS: ");

                // mostra cada limpeza de uma forma formatada
                for (Limpeza limpeza : ListaLimpeza) {
                    System.out.println(limpeza.getCodigo() + " - " +
                            limpeza.getDescricao() + " - " +
                            limpeza.getTipo() + " - " +
                            limpeza.CalcularValorTotal()
                    );
                }

                System.out.println("EXIBINDO TODAS AS CALIBRACOES: ");
                // todas as calibracoes
                for (CalibracaoPneus listaCalibracaoPneus : ListaCalibracaoPneus) {
                    System.out.println(listaCalibracaoPneus.getCodigo() + " - " +
                            listaCalibracaoPneus.getDescricao() + " - " +
                            listaCalibracaoPneus.getFormato() + " - " +
                            listaCalibracaoPneus.CalcularValorTotal()
                    );
                }

                System.out.println("EXIBINDO TODAS TROCAS DE OLEO FEITAS: ");
                // e todas as trocas de oleo
                for (TrocaOleo trocaOleo : ListaTrocaOleo) {
                    System.out.println(trocaOleo.getCodigo() + " - " +
                            trocaOleo.getDescricao() + " - " +
                            trocaOleo.getMarca() + " - " +
                            trocaOleo.CalcularValorTotal()
                    );
                }
            } else if (escolha.equals("3")) { // para sair
                break;
            } else { // caso de erro
                System.out.println("Tente novamente.");
            }
        }
    }
}