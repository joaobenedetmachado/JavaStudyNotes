package CourseStudies.Exercicies.Polimorfismo.Prova;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario>
        Funcionario f1 = new Funcionario(1, "lucas", "masc", 10, 10.0);

        Estagiario e1 = new Estagiario(1, "lucas", "masc", 10, 10.0);

        System.out.println(f1.pegarValorTotal());
        System.out.println(e1.pegarValorTotal());
    }
}
