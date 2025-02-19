package CursoUdemy;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("impar");
        }
    }
}
