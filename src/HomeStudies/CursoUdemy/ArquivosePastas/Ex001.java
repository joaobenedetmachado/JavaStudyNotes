package CursoUdemy.ArquivosePastas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/Juaow/Documents/JavaStudyNotes/src/CursoUdemy/TryCatch/in.txt");
        Scanner sc = null;

try {
    sc = new Scanner(file);
    while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
    }
} catch (IOException e) {
    System.out.println("ERRO:" + e.getMessage());
}
 finally {
    sc.close();
    System.out.println("Acabou.");
}

    }
}
