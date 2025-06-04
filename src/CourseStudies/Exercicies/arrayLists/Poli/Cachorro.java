package CourseStudies.Exercicies.arrayLists.Poli;

public class Cachorro extends AnimalDomestico{
    private int numero_de_patas;

    public Cachorro(String nome, int idade, int numero_de_patas) {
        super(nome, idade);
        this.numero_de_patas = numero_de_patas;
    }

    public int getNumero_de_patas() {
        return numero_de_patas;
    }

    public void setNumero_de_patas(int numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }
}
