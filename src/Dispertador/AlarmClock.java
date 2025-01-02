package Dispertador;

import javax.imageio.IIOException;
import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePathSound;
    private final Scanner scanner;
    AlarmClock(LocalTime alarmTime, String filePathSound, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePathSound = filePathSound;
        this.scanner = scanner;
    }
    @Override
    public void run(){

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                int horas = now.getHour();
                int minutos = now.getMinute();
                int segundos = now.getSecond();


                System.out.printf("\r%02d:%02d:%02d", horas, minutos,segundos);
            } catch (InterruptedException e) {
                System.out.println("Thread foi interrompida");
            }
        }
        PlaySound(filePathSound);
    }
    private void PlaySound(String filePathSound) {

        File audioFile = new File(filePathSound);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);)
        {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Aperta enter para parar o alarme");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch (UnsupportedAudioFileException e ) {
            System.out.println("FOrmato de audio nao aceito");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio nao encontrado");
        }
        catch (IOException e) {
            System.out.println("PROBLEMA NO PC");
        }
    }
}
