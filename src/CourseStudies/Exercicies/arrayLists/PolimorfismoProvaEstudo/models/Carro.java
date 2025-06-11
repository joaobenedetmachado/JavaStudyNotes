package CourseStudies.Exercicies.arrayLists.PolimorfismoProvaEstudo.models;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String modelo, Integer ano, int numeroPortas) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                '}';
    }

    @Override
    public double calcularImposto() {
        return 1000 + (100 * this.numeroPortas);
    }
}
