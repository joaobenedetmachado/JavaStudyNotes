package CursoUdemy.PolimorfismoHeranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Employed> listaEmployed = new ArrayList<>();
        List<OutEmployed> listaOutEmployed = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Employeds: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("OutSorced Employed? [y/n]: ");
            String r = sc.nextLine();

            if(r.equals("y")){
                System.out.println("name:");
                String name = sc.nextLine();
                System.out.println("hours");
                Integer hours = sc.nextInt();
                System.out.println("value per hours");
                double valuePerHours = sc.nextDouble();
                OutEmployed out = new OutEmployed(name, hours, valuePerHours);
                listaOutEmployed.add(out);
                sc.nextLine();
            } else {
                System.out.println("name:");
                String name = sc.nextLine();
                System.out.println("hours");
                Integer hours = sc.nextInt();
                System.out.println("value per hours");
                double valuePerHours = sc.nextDouble();
                Employed out = new Employed(name, hours, valuePerHours);
                listaEmployed.add(out);
                sc.nextLine();
            }
        }

        for (Employed emp : listaEmployed) {
            System.out.println(emp.payment());
        }

        for (OutEmployed emp : listaOutEmployed) {
            System.out.println(emp.payment());
        }



}
}
