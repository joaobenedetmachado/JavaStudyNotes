package CourseStudies.Exercicies.Polimorfismo;

public class Carro extends Veiculo{

    public Carro(int codigo, String marca, String modelo, int ano, double peso) {
        super(codigo, marca, modelo, ano, peso);
    }

    @Override
    public void Revisao() {
        System.out.println("Revisao CARRO");
    }

    @Override
    public void Manutencao() {
        System.out.println("Manutencao CARRO");
    }

    @Override
    public void Limpeza() {
        System.out.println("Limpeza CARRO");
    }

    @Override
    public void Abastecimento() {
        System.out.println("Abastecimento CARRO");
    }
}
