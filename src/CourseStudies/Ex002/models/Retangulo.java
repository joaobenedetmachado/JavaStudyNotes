package Ex002.models;

public class Retangulo implements tiposFiguras {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo {" +
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
        return getAltura() * getBase();
    }
}
