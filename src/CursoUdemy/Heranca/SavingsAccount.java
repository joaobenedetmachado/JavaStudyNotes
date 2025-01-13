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
}
