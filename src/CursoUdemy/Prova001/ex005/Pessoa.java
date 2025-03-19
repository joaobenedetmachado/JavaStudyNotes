package atividades.ex005;

public class Pessoa {
    private double altura;
    private double peso;
    private String sexo;

    public Pessoa(double altura, double peso, String sexo) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
