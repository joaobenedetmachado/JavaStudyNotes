package CourseStudies.Exercicies.Heranca.Ex001;

public class Animal {
    private String nome;
    private Double comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private double veloMedia;

    public Animal() {}

    public Animal(String nome, Double comprimento, int numeroDePatas, String cor, String ambiente, double veloMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.veloMedia = veloMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVeloMedia() {
        return veloMedia;
    }

    public void setVeloMedia(double veloMedia) {
        this.veloMedia = veloMedia;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numeroDePatas=" + numeroDePatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", veloMedia=" + veloMedia +
                '}';
    }
}
