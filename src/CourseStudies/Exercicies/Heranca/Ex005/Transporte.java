package CourseStudies.Exercicies.Heranca.Ex005;

public class Transporte {
    private String descrição;
    private Double tamanho;
    private double peso;

    @Override
    public String toString() {
        return "Transporte{" +
                "descrição='" + descrição + '\'' +
                ", tamanho=" + tamanho +
                ", peso=" + peso +
                '}';
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Transporte(String descrição, Double tamanho, double peso) {
        this.descrição = descrição;
        this.tamanho = tamanho;
        this.peso = peso;
    }
}
