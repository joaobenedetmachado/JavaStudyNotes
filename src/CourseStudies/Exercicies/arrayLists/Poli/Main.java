package CourseStudies.Exercicies.arrayLists.Poli;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cachorro> cachorros = new ArrayList<>();
        ArrayList<Peixe> peixes = new ArrayList<>();

        boolean aux = true;
        while (aux) {
            System.out.println("Cadastrar Cachorro (1) | Peixe (2) | Listar ambos (3) | Sair (0)");
            int escolhaAnimais = sc.nextInt();

            if (escolhaAnimais == 1) {
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                sc.next();
                System.out.println("Idade: ");
                int idade = sc.nextInt();
                System.out.println("Numero de patas: ");
                int numerodepatas = sc.nextInt();
                Cachorro tempDog = new Cachorro(nome, idade, numerodepatas);
                cachorros.add(tempDog);
            } else if (escolhaAnimais == 2) {
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                sc.next();
                System.out.println("Idade: ");
                int idade = sc.nextInt();
                System.out.println("Cor: ");
                String cor = sc.next();
                Peixe tempFish = new Peixe(nome, idade,cor);
                peixes.add(tempFish);
            } else if (escolhaAnimais == 3) {
                System.out.println("Cachorros: ");
                for (int i = 0; i < cachorros.size(); i++) {
                    System.out.println(cachorros.get(i));
                }
                System.out.println("Peixes: ");
                for (int i = 0; i < peixes.size(); i++) {
                    System.out.println(peixes.get(i));
                }
            } else if (escolhaAnimais == 0) {
                aux = false ;
            }

        }
        }

    }

