package CursoUdemy;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        String seuNome;
        Scanner sc = new Scanner(System.in);
        seuNome = sc.nextLine();
        String[] partesDoNome = seuNome.split(" ");

        System.out.println(seuNome.toLowerCase());
        System.out.println(seuNome.toUpperCase());
        System.out.println(seuNome.trim());
        System.out.println(seuNome.substring(2, 10));
        System.out.println(seuNome.replace("a", "X"));
        System.out.println("Primeiro nome : " + partesDoNome[0]);
        System.out.println("Ultimo nome : " + partesDoNome[partesDoNome.length - 1]);
        /*
        INPUT: joao victor benedet machado
                joao victor benedet machado
                JOAO VICTOR BENEDET MACHADO
                joao victor benedet machado
                ao victo
                joXo victor benedet mXchXdo
                Primeiro nome : joao
                Ultimo nome : machado
        */

    }
}
