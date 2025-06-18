package exercicio_1.models;

public abstract class Funcionarios {
    private Integer matricula;
    private String nome;
    private String sexo;
    private Double salario_base;

    public Funcionarios() {}

    public Funcionarios(Integer matricula, String nome, String sexo, Double salario_base) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.salario_base = salario_base;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario_base=" + salario_base +
                '}';
    }

    public double calcularSalario() {
        return this.getSalario_base();
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
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

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }
}
