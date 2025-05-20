package CourseStudies.Exercicies.Polimorfismo.Prova;

public class Funcionario {
    private Integer codigo;
    private String nome;
    private String sexo;
    private Integer nrHorasTrabalhadas;
    private Double valorHora;

    public Funcionario(Integer codigo, String nome, String sexo, Integer nrHorasTrabalhadas, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.nrHorasTrabalhadas = nrHorasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getNrHorasTrabalhadas() {
        return nrHorasTrabalhadas;
    }

    public void setNrHorasTrabalhadas(Integer nrHorasTrabalhadas) {
        this.nrHorasTrabalhadas = nrHorasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", nrHorasTrabalhadas=" + nrHorasTrabalhadas +
                ", valorHora=" + valorHora +
                '}';
    }

    public double pegarValorTotal() {
        return this.valorHora * this.nrHorasTrabalhadas;
    }
}
