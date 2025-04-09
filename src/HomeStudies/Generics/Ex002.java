package HomeStudies.Generics;

import java.util.HashMap;

public class Ex002 {
    public static void main(String[] args) {
        //HashMap's
        HashMap<String,Double> map = new HashMap<>();
        //aqui a gente diz basicamente oq precisar ter obrigatoriamente no hashmap
        //utiliza-se do put para colocar
        map.put("João", 11194.3);

        for (String chave : map.keySet()) {
            //forma de mostar
            System.out.println(chave + " -> " + map.get(chave));
        }


        HashMap<String, Integer> idadePorPessoa = new HashMap<>();
        idadePorPessoa.put("João", 16);
        idadePorPessoa.put("Maria", 18);

        int idadeJoao = idadePorPessoa.get("João");

    }
}
