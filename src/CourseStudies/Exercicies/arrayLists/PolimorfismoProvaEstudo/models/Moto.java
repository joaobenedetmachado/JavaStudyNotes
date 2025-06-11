package CourseStudies.Exercicies.arrayLists.PolimorfismoProvaEstudo.models;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String modelo, Integer ano, int cilindradas) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }


    @Override
    public double calcularImposto() {
        return this.cilindradas < 250 ? 300 : 600;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                '}';
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
