package CursoUdemy.Dolar;

public class CurrencyConverter {
    public static final double DOLAR = 3.10;
    public double valorEmReais;

    public double GetValorEmDolar() {
        return (this.valorEmReais * DOLAR) + (this.valorEmReais * DOLAR)/100*6;
    }
}
