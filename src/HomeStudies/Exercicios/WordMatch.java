package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Word: ");
        String FirstWord = sc.nextLine();

        System.out.print("Second Word: ");
        String SecondWord = sc.nextLine();

        int valueSumSequential = 0;
        for (int i = 0; i < FirstWord.length(); i++) {
            if (FirstWord.charAt(i) == SecondWord.charAt(i)) {
                valueSumSequential++;
            }
        }

        int valueSumNotSequential = 0;
        List<String> FirstWordToArray = new ArrayList<>();
        List<String> SecondWordToArray = new ArrayList<>();

        for (int i = 0; i < FirstWord.length(); i++) {
            FirstWordToArray.add(String.valueOf(FirstWord.charAt(i)));
            SecondWordToArray.add(String.valueOf(SecondWord.charAt(i)));
        }

        for (String charFromFirst : FirstWordToArray) {
            if (SecondWordToArray.contains(charFromFirst)) {
                valueSumNotSequential++;
                SecondWordToArray.remove(charFromFirst);
            }
        }



        System.out.println(valueSumSequential);
        System.out.println(valueSumNotSequential);
    }
}
