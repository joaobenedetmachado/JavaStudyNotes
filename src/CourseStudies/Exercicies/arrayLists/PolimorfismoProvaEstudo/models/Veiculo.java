package CourseStudies.Exercicies.arrayLists.PolimorfismoProvaEstudo.models;

public abstract class Veiculo {
    private String modelo;
    private Integer ano;

    public Veiculo(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
