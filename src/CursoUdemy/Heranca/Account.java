package CursoUdemy.Heranca;

public class Account {
    private Integer number;
    private String holder;
    protected double balance;


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account() {
    }

    public void withdraw(double value) {
            this.balance = balance - 5 - value ;

    }

    public void deposit(double value) {
        this.balance += value;
    }


    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
