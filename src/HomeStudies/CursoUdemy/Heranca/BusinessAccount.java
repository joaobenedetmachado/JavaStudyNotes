package CursoUdemy.Heranca;

public class BusinessAccount extends Account{

    private double loanLimit;


    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double value) {
        if (value <= loanLimit) {
            deposit(value);
        } else {
            System.out.println("valor acima do limite");
        }
    }

    @Override
    public void withdraw(double value) {
        super.withdraw(value); // o super serve meio que para sobrepor um metodo porem adcionando algo a mais
        balance -= 2;
    }
}
