package Ex002.models;

public class Quadrado implements tiposFiguras{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public double CalcularArea() {
        return getLado() * getLado();
    }
}
