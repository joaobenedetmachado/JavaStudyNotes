package Exercicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CifraDeCesar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();
        List<Character> WordToArray = new ArrayList<>();
        List<String> alfabeto = new ArrayList<>();

        for (char letra = 'a'; letra <= 'z'; letra++) {
            alfabeto.add(String.valueOf(letra));
        }

        for (int i = 0; i < palavra.length(); i++) {
            WordToArray.add(palavra.charAt(i));
        }
        System.out.println();

        for (int x = 0; x < WordToArray.size(); x++) {
            String letraParaBuscar = String.valueOf(WordToArray.get(x));
            int posicao = alfabeto.indexOf(letraParaBuscar);
            int novaPosicao = (posicao + 2) % 26; // modulo para que nunca ultrapasse de 26 caracteres e assim voltando
            System.out.print(alfabeto.get(novaPosicao));
        }
    }
}
