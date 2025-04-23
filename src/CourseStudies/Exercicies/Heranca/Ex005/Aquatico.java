package CourseStudies.Exercicies.Heranca.Ex005;

public class Aquatico extends Transporte{
    private double Altura;

    public Aquatico(String descrição, Double tamanho, double peso, double altura) {
        super(descrição, tamanho, peso);
        Altura = altura;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                "Altura=" + Altura +
                '}';
    }
}
