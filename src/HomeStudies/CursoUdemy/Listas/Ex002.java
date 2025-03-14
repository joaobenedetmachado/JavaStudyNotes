package CursoUdemy.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios serao adcionados: ");
        int x = sc.nextInt();
        sc.nextLine();
        List<Funcionario> lista = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.print("ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Funcionario fc = new Funcionario(ID, nome, salary);
            lista.add(fc);
        }
        for (Funcionario n : lista) {
            System.out.println(n);
        }

        System.out.println("para qual id deseja adcionar um aumento de 10%");

        int number = sc.nextInt();
        List<Funcionario> listaRetorno = lista.stream().filter(l -> l.getID() == number).toList();

        if (listaRetorno.isEmpty()) {
            System.out.println("Usuario com tal id nao encontrado");
        } else {
            Funcionario func1 = listaRetorno.get(0);
            double salaryAtual = func1.getSalary();
            func1.setSalary((salaryAtual*1.1));
        }

        for (Funcionario n : lista) {
            System.out.println(n);
        }

    }
}
