package CursoUdemy;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number > 0){
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
    }
}
