package exercicio_1.models;

public class Engenheiro extends Funcionarios{
    private String area_atuação;

    public Engenheiro() {}

    public Engenheiro(Integer matricula, String nome, String sexo, Double salario_base, String area_atuação) {
        super(matricula, nome, sexo, salario_base);
        this.area_atuação = area_atuação;
    }

    public double calcularSalario() { //calcular salario com 15% de acrescimo
        return this.getSalario_base() * 1.15;
    }

    public String getArea_atuação() {
        return area_atuação;
    }

    public void setArea_atuação(String area_atuação) {
        this.area_atuação = area_atuação;
    }
}
