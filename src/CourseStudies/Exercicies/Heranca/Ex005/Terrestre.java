package CourseStudies.Exercicies.Heranca.Ex005;

public class Terrestre extends Transporte{
    private Integer numeroDeRodas;

    public Terrestre(String descrição, Double tamanho, double peso, Integer numeroDeRodas) {
        super(descrição, tamanho, peso);
        this.numeroDeRodas = numeroDeRodas;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "numeroDeRodas=" + numeroDeRodas +
                '}';
    }

    public Integer getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(Integer numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }
}
