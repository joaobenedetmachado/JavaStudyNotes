package CourseStudies.Exercicies.Polimorfismo;

public class Moto extends Veiculo{

    public Moto(int codigo, String marca, String modelo, int ano, double peso) {
        super(codigo, marca, modelo, ano, peso);
    }
        public void Revisao() {
            System.out.println("Revisao MOTO");
        }

        @Override
        public void Manutencao() {
            System.out.println("Manutencao MOTO");
        }

        @Override
        public void Limpeza() {
            System.out.println("Limpeza MOTO");
        }

        @Override
        public void Abastecimento() {
            System.out.println("Abastecimento MOTO");
        }
}
