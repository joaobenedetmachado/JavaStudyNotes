package exercicio_1;

import exercicio_1.models.Engenheiro;
import exercicio_1.models.Supervisor;
import exercicio_1.models.Tecnico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MENU(); // chamei a funcao principal
    }

    public static void MENU() {
        ArrayList<Engenheiro> listaEng = new ArrayList<>(); //criei as 3 listas
        ArrayList<Supervisor> listaSup = new ArrayList<>();
        ArrayList<Tecnico> listaTec = new ArrayList<>();
        Scanner sc = new Scanner(System.in); // iniciei o scanner

        while (true) {
            System.out.println("=== MENU ==="); // os prints do menu
            System.out.println("1 - Cadastrar Engenheiro");
            System.out.println("2 - Cadastrar Supervisor");
            System.out.println("3 - Cadastrar Técnico");
            System.out.println("4 - Mostrar Dados");
            System.out.println("5 - Sair");
            System.out.println(">");
            String escolha = sc.next();

            if (escolha.equals("1")) { // se escolher 1 ele cadastra o engenheiro
                for (int i = 0; i < listaEng.size(); i++) { // caso tenha alguem cadastrado ele mostra e tal
                    System.out.println(listaEng.get(i).getMatricula() + " - " +
                            listaEng.get(i).getNome() + " - " +
                            listaEng.get(i).getArea_atuação());
                }
                System.out.println("CADASTRAR ENGENHEIRO: ");
                System.out.print("Matricula: ");
                Integer matricula = sc.nextInt();
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Sexo: ");
                String sexo = sc.next();
                System.out.print("Salario base: ");
                Double salario_base = sc.nextDouble();
                System.out.print("Area de atuação: ");
                String area_atuacao = sc.next();

                Engenheiro engTemp = new Engenheiro(matricula, nome, sexo, salario_base, area_atuacao);

                // aqui ele chama a funcao de calcular o salario
                System.out.println("ENGENHEIRO CRIADO - SALARIO FINAL: " + engTemp.calcularSalario());

                listaEng.add(engTemp);

            } else if (escolha.equals("2")) {
                for (int i = 0; i < listaSup.size(); i++) { // caso tenha alguem cadastrado ele mostra e tal
                    System.out.println(listaSup.get(i).getMatricula() + " - " +
                            listaSup.get(i).getNome() + " - " +
                            listaSup.get(i).getSalario_base());
                }
                System.out.println("CADASTRAR SUPERVISOR: ");
                System.out.print("Matricula: ");
                Integer matricula = sc.nextInt();
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Sexo: ");
                String sexo = sc.next();
                System.out.print("Salario base: ");
                Double salario_base = sc.nextDouble();
                System.out.print("Setor: ");
                String setor = sc.next();

                Supervisor supTemp = new Supervisor(matricula, nome, sexo, salario_base, setor);

                // aqui chama a calcular salario do supevisor
                System.out.println("SUPERVISOR CRIADO - SALARIO FINAL: " + supTemp.calcularSalario());

                listaSup.add(supTemp);

            }else if (escolha.equals("3")) {
                for (int i = 0; i < listaTec.size(); i++) { // caso tenha alguem cadastrado ele mostra e tal
                    System.out.println(listaSup.get(i).getMatricula() + " - " +
                            listaTec.get(i).getNome() + " - " +
                            listaTec.get(i).getSalario_base());
                }
                System.out.println("CADASTRAR TECNICO: ");
                System.out.print("Matricula: ");
                Integer matricula = sc.nextInt();
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Sexo: ");
                String sexo = sc.next();
                System.out.print("Salario base: ");
                Double salario_base = sc.nextDouble();
                System.out.print("Tipo: ");
                String tipo = sc.next();

                Tecnico tecTemp = new Tecnico(matricula, nome, sexo, salario_base, tipo);

                // aqui q chama a funcao pra calcular salario e tal
                System.out.println("TECNICO CRIADO - SALARIO FINAL: " + tecTemp.calcularSalario());

                listaTec.add(tecTemp);
            } else if (escolha.equals("4")) {
                //invez de criar outra funcao eu mostrei aqui mesmo
                System.out.println("MOSTRAR DADOS");
                double totalEngenheiros = 0; // TOTAL DOS SALARIOS DE CADA UM
                double totalSupervisor = 0;
                double totalTecnicos = 0;

                // fica iterando o salario de cada engenheiro
                for (int i = 0; i < listaEng.size(); i++) {
                    totalEngenheiros = totalEngenheiros + listaEng.get(i).calcularSalario();
                }

                // aqui pros supervisores
                for (int i = 0; i < listaSup.size(); i++) {
                    totalSupervisor = totalSupervisor + listaSup.get(i).calcularSalario();
                }

                // e aqui pros tecnicos
                for (int i = 0; i < listaTec.size(); i++) {
                    totalTecnicos = totalTecnicos + listaTec.get(i).calcularSalario();
                }

                // aqui ele pega o numero total de todos os funcionarios
                int numeroTotalFuncionarios = listaSup.size() + listaEng.size() + listaTec.size();


                // soma todos os salarios e faz a media
                double SalarioMediaTotalTodosFuncionarios
                        = (totalEngenheiros + totalSupervisor + totalTecnicos) / numeroTotalFuncionarios;

                // informa tudo pro usuario
                System.out.println("SOMA TOTAL ENGENHARIA");
                System.out.println(totalEngenheiros);

                System.out.println("SOMA TOTAL SUPERVISOR");
                System.out.println(totalSupervisor);

                System.out.println("SOMA TOTAL TECNICOS");
                System.out.println(totalTecnicos);

                System.out.println("MEDIA GERAL DE TODOS OS FUNCIONARIOS: ");
                System.out.println(SalarioMediaTotalTodosFuncionarios);

            } else if (escolha.equals("5")) { // sai do programa
                break;
            } else { // caso nao tenha essa opcao que o user digitou,
                // tratamento de erro
                System.out.println("Tente novamente");
            }

        }
    }
}