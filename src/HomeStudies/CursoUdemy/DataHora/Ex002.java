package CursoUdemy.DataHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex002 {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        LocalDate semanaAnterior = d01.minusDays(7);
        LocalDate proximaSemana = d01.plusDays(7);
        System.out.println(semanaAnterior);
        System.out.println(proximaSemana);

        Duration t1 = Duration.between(d01, semanaAnterior);

        System.out.println(t1.toDays());
    }
}
