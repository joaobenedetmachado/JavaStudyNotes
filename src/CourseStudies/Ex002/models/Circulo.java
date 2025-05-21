package Ex002.models;

public class Circulo implements tiposFiguras{

    private double raio;
    // ja que o PI nunca muda, ele comeca assim mesmo e nao vai para a classe construtora
    private double PI = 3.1416;


    public Circulo(double raio) {
        this.raio = raio;

    }

    @Override
    public double CalcularArea() {
        return (getRaio() * getRaio()) * PI;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
}
