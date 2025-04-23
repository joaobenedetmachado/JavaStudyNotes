package CourseStudies.Exercicies.Heranca.Ex005;

public class Aero extends Transporte{
    private int numeroPassageiros;

    public Aero(String descrição, Double tamanho, double peso, int numeroPassageiros) {
        super(descrição, tamanho, peso);
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public String toString() {
        return "Aero{" +
                "numeroPassageiros=" + numeroPassageiros +
                '}';
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
