package HomeStudies.Generics;

import java.util.ArrayList;
import java.util.List;

public class Ex001 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        //so aceita um tipo

        List listaSemGenerics = new ArrayList<>();

        listaSemGenerics.add(1425);
        listaSemGenerics.add("ola");
        // aceita qualquer tipo
    }
}
