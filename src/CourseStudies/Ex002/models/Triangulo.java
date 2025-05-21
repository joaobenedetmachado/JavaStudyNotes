package Ex002.models;

public class Triangulo implements tiposFiguras{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Tringulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return (getAltura() * getBase()) / 2;
    }
}
