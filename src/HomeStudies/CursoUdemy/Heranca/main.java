package HomeStudies.CursoUdemy.Heranca;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Account a1 = new Account(123, "João machado", 1200);
        //BusinessAccount a2 = new BusinessAccount(312, "lucas silveria", 1200, 1000);

        // UPCASTING = basciamente pegar uma classe (Account) é transformala numa subclasse dela mesma
        //Account aa1 = a2;


        SavingsAccount a3 = new SavingsAccount(546, "marcio rovaris", 1230, 1.1);

        // DOWNCASTING = pegar um subclasse e tentar transformar numa classe, que nao funciona

        // BusinessAccount ba1 = a1; isso retorna um erro, entao precisa pegar e forcar esse casting:

        //BusinessAccount ba1 = (BusinessAccount)a1;

        a1.withdraw(100);
        System.out.println(a1);
        a3.withdraw(100);
        System.out.println(a3);

        List<Account> lista = new ArrayList<>();

        lista.add(new SavingsAccount(1001, "maria", 500, 0.01));
        lista.add(new SavingsAccount(1002, "lara", 1000.10, 0.12));

        double sum = 0.0;
        for(Account acc : lista) {
            sum += acc.getBalance();
        }

        System.out.println("Total balance: " + sum);


    }
}
