package CursoUdemy.Heranca;

public class SavingsAccount extends Account {
    private double InterestRate;

     public SavingsAccount () {
            super();
     }

    public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        InterestRate = interestRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public void updateBalanece() {
        balance += balance * InterestRate;
    }

    @Override // o override é chamado quando na superclasse ja existe um metodo com o mesmo nome, porem na subclasse tera um compoertamento diferente
    public void withdraw(double value) {
         if (value < balance) {
             balance -= value;
         } else {
             System.out.println("erro, valor nao disponivel na conta");
         }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "InterestRate=" + InterestRate +
                ", balance=" + balance +
                '}';
    }
}
