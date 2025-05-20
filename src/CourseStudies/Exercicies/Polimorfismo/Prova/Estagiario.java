package CourseStudies.Exercicies.Polimorfismo.Prova;

public class Estagiario extends Funcionario{

    public Estagiario(Integer codigo, String nome, String sexo, Integer nrHorasTrabalhadas, Double valorHora) {
        super(codigo, nome, sexo, nrHorasTrabalhadas, valorHora);
    }

    public double pegarValorTotal() {
        return (this.getValorHora() * this.getNrHorasTrabalhadas()) * 1.05;
    }
}
