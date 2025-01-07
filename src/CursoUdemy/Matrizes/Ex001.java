package CursoUdemy.Matrizes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("INSIRA QUAL SERA A DIMENSAO DA MATRIZ NxN: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        List<Integer> mainDiagonal = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mainDiagonal.add(matriz[i][i]);
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (Integer x : mainDiagonal) {
            System.out.print(x + " ");
        }

        List<Integer> numeroNegativos = new ArrayList<>();
        System.out.println("\nNUMEROS NEGATIVOS: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    numeroNegativos.add(matriz[i][j]);
                }
            }
        }

        for (Integer x : numeroNegativos) {
            System.out.print(x + " ");
        }

    }
}
