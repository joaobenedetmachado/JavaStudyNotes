package CourseStudies.Exercicies.Polimorfismo;

public class Veiculo {
    private int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private double peso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Veiculo(int codigo, String marca, String modelo, int ano, double peso) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", peso=" + peso +
                '}';
    }

    public void Revisao() {
        System.out.println("Revisao veiculo");
    }
    public void Manutencao() {
        System.out.println("Manutencao veiculo");
    }
    public void Limpeza() {
        System.out.println("Limpeza veiculo");
    }
    public void Abastecimento() {
        System.out.println("Abastecimento veiculo");
    }


}
