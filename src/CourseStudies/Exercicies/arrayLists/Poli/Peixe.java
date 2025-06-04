package CourseStudies.Exercicies.arrayLists.Poli;

public class Peixe extends AnimalDomestico{
    private String cor;

    public Peixe(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
