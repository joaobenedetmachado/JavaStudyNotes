package CourseStudies.Exercicies.arrayLists.PolimorfismoProvaEstudo.models;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> listas = new ArrayList<>();

        listas.add(new Carro("Civic", 2020, 4));
        listas.add(new Carro("Corolla", 2019, 4));
        listas.add(new Carro("Gol", 2015, 2));
        listas.add(new Carro("Onix", 2021, 4));
        listas.add(new Carro("Polo", 2018, 4));
        listas.add(new Carro("Fox", 2014, 2));
        listas.add(new Carro("Uno", 2010, 2));
        listas.add(new Carro("Fusion", 2017, 4));
        listas.add(new Carro("HB20", 2022, 4));
        listas.add(new Carro("Palio", 2013, 2));

        listas.add(new Moto("CG 160", 2018, 160));
        listas.add(new Moto("XRE 300", 2022, 300));
        listas.add(new Moto("Titan 150", 2015, 150));
        listas.add(new Moto("Fazer 250", 2019, 250));
        listas.add(new Moto("Hornet 600", 2011, 600));
        listas.add(new Moto("Ninja 400", 2020, 400));
        listas.add(new Moto("Bros 160", 2021, 160));
        listas.add(new Moto("Twister 250", 2016, 250));
        listas.add(new Moto("Harley 883", 2014, 883));
        listas.add(new Moto("Pop 100", 2012, 100));
//
//        for (int i = 0; i < listas.size(); i++) {
//            if (listas.get(i).getAno() < 2015) {
//                System.out.println(listas.get(i));
//            }
//        }

        for (int i = 0; i < listas.size(); i++) {
              System.out.println(listas.get(i));
        }


        int maiorAno = 0;
        for (int i = 0; i < listas.size(); i++) {
            if (listas.get(i).getAno() > maiorAno) {
                maiorAno = listas.get(i).getAno();
            }
        }

        int menorAno = listas.get(0).getAno();
        for (int i = 0; i < listas.size(); i++) {
            if (listas.get(i).getAno() < menorAno) {
                menorAno = listas.get(i).getAno();
            }
        }

        System.out.println(maiorAno);
        System.out.println(menorAno);

        System.out.println("Qual deseja remover? {POR NOME}");
        String escolha = "Gol";

        for (int i = 0; i < listas.size(); i++) {
            if (listas.get(i).getModelo() == escolha) {
                listas.remove(listas.get(i));
            }
        }
        for (int i = 0; i < listas.size(); i++) {
            System.out.println(listas.get(i));
        }



    }

}
