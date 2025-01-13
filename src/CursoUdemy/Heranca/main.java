package CursoUdemy.Heranca;

public class main {
    public static void main(String[] args) {
        Account a1 = new Account(123, "João machado", 1200);
        BusinessAccount a2 = new BusinessAccount(312, "lucas silveria", 1200, 1000);

        // UPCASTING = basciamente pegar uma classe (Account) é transformala numa subclasse dela mesma
        Account aa1 = a2;


        SavingsAccount a3 = new SavingsAccount(546, "marcio rovaris", 1230, 1.1);

        // DOWNCASTING = pegar um subclasse e tentar transformar numa classe, que nao funciona

        // BusinessAccount ba1 = a1; isso retorna um erro, entao precisa pegar e forcar esse casting:

        BusinessAccount ba1 = (BusinessAccount)a1;


    }
}
