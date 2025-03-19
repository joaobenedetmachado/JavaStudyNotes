package atividades.ex004;

public class Circulo {
    private double raio;
    private double perimetro;
    private double area;

    public Circulo(double raio, double perimetro, double area) {
        this.raio = raio;
        this.perimetro = perimetro;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "perimetro=" + perimetro +
                ", area=" + area +
                ", raio=" + raio +
                '}';
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
