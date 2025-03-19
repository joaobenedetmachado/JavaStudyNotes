package atividades.ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //chamo as variaveis e tal
        Scanner sc = new Scanner(System.in);
        Candidato candidato1 = new Candidato("José");
        Candidato candidato2 = new Candidato("Maria");

        Integer voto;


        //while para rodar ate que haja um break
        while (true){
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - Candidata Maria");
            System.out.println("2 - Candidato José");
            System.out.println("3 - Branco");
            System.out.println("4 - Encerrar a eleição");
            System.out.print(">");
            voto = sc.nextInt();

            // dependendo do numero do voto, ele incrementa na classe, se for branco ou nulo, nao
            if (voto == 1) {
                candidato1.aumentarVoto();
            } else if (voto == 2) {
                candidato2.aumentarVoto();
            } else if (voto == 3) {
                System.out.println("VOTO EM BRANCO!");
            } else if (voto == 4){
                System.out.println("Encerrando a eleicão");
                break;
            }

        }

        //quando sair do while ele pega as quantidade de todos das classes e compara, e se tiver empate ele mostra tambem
        Integer quantidadeVotos1 = candidato1.getQuantidadeVotos();
        Integer quantidadeVotos2 = candidato2.getQuantidadeVotos();
        if (quantidadeVotos2 > quantidadeVotos1) {
            System.out.println("Candidato " + candidato2.getNome() + ", ganhou com " + quantidadeVotos2 + " votos");
        } else if (quantidadeVotos1 > quantidadeVotos2) {
            System.out.println("Candidato " + candidato1.getNome() + ", ganhou com " + quantidadeVotos1 + " votos");
        } else if (quantidadeVotos1 == quantidadeVotos2) {
            System.out.println("Empate");
        }
    }
}
