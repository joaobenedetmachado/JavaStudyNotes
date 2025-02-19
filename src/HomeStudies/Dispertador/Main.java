package Dispertador;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalTime alarmTime = null;
    String FilePath = "/home/joao/JavaStudyNotes/src/Dispertador/Despertador-Motorola.wav";

    while(alarmTime == null) {
        try {
            System.out.print("Horario do alarme (HH:MM:SS): ");
            String InputTime = scanner.nextLine();
            alarmTime = LocalTime.parse(InputTime, formatter);
            System.out.println("Alarme setado para " + alarmTime);

        } catch (DateTimeParseException e) {
            System.out.println("Por favor insira um horario valido");
        }
    }
        AlarmClock alarmClock = new AlarmClock(alarmTime, FilePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
