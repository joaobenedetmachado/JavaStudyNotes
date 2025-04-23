package CourseStudies.Exercicies.Heranca.Ex003;

import CourseStudies.Exercicies.Heranca.Ex001.Animal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, Double comprimento, int numeroDePatas, String cor, String ambiente, double veloMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, veloMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
