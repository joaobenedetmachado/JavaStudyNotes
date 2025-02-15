package Exercicios;

import java.util.ArrayList;

public class Duplicates {
    public static void main(String[] arg) {
        ArrayList<Integer> mainArray = new ArrayList<>();
        mainArray.add(1);
        mainArray.add(2);
        mainArray.add(3);
        mainArray.add(3);
        mainArray.add(7);
        mainArray.add(7);

        ArrayList<Integer> NewArray = new ArrayList<>();

        for (int i = 0; i < mainArray.size(); i++) {
            if (!NewArray.contains(mainArray.get(i))) {
                NewArray.add(mainArray.get(i));
            }
        }
        System.out.println(NewArray);
    }
}
