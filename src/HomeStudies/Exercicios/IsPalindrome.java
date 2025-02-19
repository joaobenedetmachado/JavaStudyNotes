package Exercicios;

import java.util.Scanner;


public class IsPalindrome {
    public static void main(String[] args) {
        //Check if a word is palindrome
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Word: ");
        String word = sc.nextLine();
        String inversedWord = InvertWord(word);

        if (word.equalsIgnoreCase(inversedWord)) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("is not a palindrome");
        }
    }

    public static String InvertWord(String word) {
        return new StringBuilder(word).reverse().toString().trim();
    }
}

