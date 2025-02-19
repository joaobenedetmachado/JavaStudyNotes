package Lista001;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        List<String> Tarefas = new ArrayList<>();
        Scanner Scanner = new Scanner(System.in);

        do {
            System.out.println("1 - Adcionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Excluir Tarefas");
            System.out.println("4 - Editar");
            System.out.println("5 - Sair do sistema");

            String Escolha = Scanner.nextLine();

            switch (Escolha) {
                case "1":
                    System.out.println("Nova tarefa: ");
                    String Tarefa = Scanner.nextLine();
                    Tarefas.add(Tarefa);
                    break;
                case "2":
                    System.out.println("-*-*-*-*-*-*-*-*-*-*");
                    for (int i = 0; i < Tarefas.size(); i++) {
                        System.out.println((i + 1) + " - " + Tarefas.get(i));
                    }
                    System.out.println("-*-*-*-*-*-*-*-*-*-*");
                    break;
                case "3":
                    System.out.println("Qual seria a posicao do elemento para ser excluido? ");
                    int posicao = Scanner.nextInt() + 1;
                    if (posicao > Tarefas.size()) {
                        System.out.println("Posicao nao encontrada");
                    } else {
                        Tarefas.remove(posicao);
                    }
                    break;
                case "4":
                    System.out.println("qual seria a posicao para alterar");
                    int posicaoEdit = Scanner.nextInt() - 1;
                    Scanner.nextLine();
                    System.out.println("novo conteudo para " + posicaoEdit + 1);


                    String Novoconteudo = Scanner.nextLine();

                    Tarefas.set(posicaoEdit, Novoconteudo);
                    break;
                case "5":
                    System.out.println("Saindo do sistema...");
                    Scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opçao nao encontrada!");
            }

        } while (true);
    }
}
