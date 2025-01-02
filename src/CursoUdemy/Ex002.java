package CursoUdemy;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        String nome;
        char sexo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu sexo [F,M]: ");
        sexo = scanner.next().charAt(0);
        scanner.close();
        System.out.println("Olá, seu nome é " + nome + " e seu sexo é " + sexo);

    }
}
