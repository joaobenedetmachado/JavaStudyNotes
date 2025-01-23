package CursoUdemy.TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {
    public static void main(String[] args) {

        File file = new File("C:/Users/Juaow/Documents/JavaStudyNotes/src/CursoUdemy/TryCatch/in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e ) {
            System.out.println("Erro ao capturar arquivo " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
