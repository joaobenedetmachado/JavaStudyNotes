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

            String Escolha = Scanner.nextLine();

            if (Escolha.equals("1")) {
                System.out.println("Nova tarefa: ");
                String Tarefa = Scanner.nextLine();
                Tarefas.add(Tarefa);
            }

            else if (Escolha.equals("2")) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*");
                for (int i = 0; i < Tarefas.size() ; i++) {
                    System.out.println(i + " - " + Tarefas.get(i));
                }
                System.out.println("-*-*-*-*-*-*-*-*-*-*");
            }

            else if (Escolha.equals("3")) {
                System.out.println("Qual seria a posicao do elemento para ser excluido? ");
                int posicao = Scanner.nextInt();
                if (posicao > Tarefas.size()){
                    System.out.println("Posicao nao encontrada");
                } else {
                    Tarefas.remove(posicao);
                }

            } else if (Escolha.equals("4")) {
                System.out.println("qual seria a posicao para alterar");
                int posicao = Scanner.nextInt();
                Scanner.nextLine();
                System.out.println("novo conteudo para "+ posicao);

                String Novoconteudo = Scanner.nextLine();

                Tarefas.set(posicao, Novoconteudo);
            }
        } while (true);
    }
}
