package CursoUdemy.Interfaces.FormaCorreta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre os Dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Data de inicio: ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Data de final: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr1 = new CarRental(inicio, finish, new Vehicle(modelo));
    }
}
