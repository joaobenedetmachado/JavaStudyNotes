package CursoUdemy.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex001 {
    public static void main(String[] args) {
        /* Dentro dos <> tem que ser uma wrapper class*/
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Joao");
        list.add("Lucas");
        list.add("Lara");
        list.add(2, "Mario");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("X-----------------------------------X");

        System.out.println(list.size());
        list.remove("Maria"); /* Ou da para remover pelo index tbm*/
        System.out.println("X-----------------------------------X");
        for (String x : list) {
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println("X-----------------------------------X");
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("X-----------------------------------X");
        System.out.println("Index of Joao: " + list.indexOf("Joao"));
        System.out.println("X-----------------------------------X");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').toList();
        /* aqui entao ele pega a list, deixa ele numa stream, para poder fazer operacoes nos elementos, retorna de acordo com o lambda e depois transoforma em lista denovo*/

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("X-----------------------------------X");
        System.out.println("achar primeira pessoa com a letra L");
        String letraL = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(letraL);
    }
}
