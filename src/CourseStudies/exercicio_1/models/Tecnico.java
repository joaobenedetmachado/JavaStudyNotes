package exercicio_1.models;

public class Tecnico extends Funcionarios {
    private String tipo;

    public Tecnico () {}

    public Tecnico(Integer matricula, String nome, String sexo, Double salario_base, String tipo) {
        super(matricula, nome, sexo, salario_base);
        this.tipo = tipo;
    }

    public double calcularSalario() { //calcular salario com 10% de acrescimo
        return this.getSalario_base() * 1.10;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
