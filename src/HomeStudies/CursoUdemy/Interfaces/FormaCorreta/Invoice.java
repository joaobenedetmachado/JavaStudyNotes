package CursoUdemy.Interfaces.FormaCorreta;

public class Invoice {

    private double basicPayment;
    private double tax;

    public Invoice() {
    }

    public double getTotalPayment() {
        return getBasicPayment() - getTax();
    }

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
