package CourseStudies.Exercicies.Heranca.Ex002;

import CourseStudies.Exercicies.Heranca.Ex001.Animal;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, Double comprimento, int numeroDePatas, String cor, String ambiente, double veloMedia, String caracteristicas) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, veloMedia);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                this.getNome() + this.getAmbiente() + this.getCor() +
                "caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}
