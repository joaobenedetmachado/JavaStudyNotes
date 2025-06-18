package exercicio_1.models;

public class Supervisor extends Funcionarios{
    private String setor;

    public Supervisor() {};

    public Supervisor(Integer matricula, String nome, String sexo, Double salario_base, String setor) {
        super(matricula, nome, sexo, salario_base);
        this.setor = setor;
    }

    public double calcularSalario() { //calcular salario com 20% de acrescimo
        return this.getSalario_base() * 1.2;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
