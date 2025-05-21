package Ex001.models;

public class CursoPresencial extends Cursos {

    private int capacidade;
    private String sala;

    public CursoPresencial(int codigo, String titulo, String nome_instrutor, int carga_horaria, double valor_base, int capacidade, String sala) {
        super(codigo, titulo, nome_instrutor, carga_horaria, valor_base);
        this.capacidade = capacidade;
        this.sala = sala;
    }



    @Override
    public double CalcularCustos() {
        return getCarga_horaria() * (getValor_base() * 1.25);
    };


    @Override
    public String MostrarInformacoes() {
        return "Cursos{" +
                "codigo=" + getCodigo() +
                ", titulo='" + getTitulo() + '\'' +
                ", nome_instrutor='" + getNome_instrutor() + '\'' +
                ", carga_horaria=" + getCarga_horaria() +
                ", valor_base=" + getValor_base() +
                '}' + "CursoPresencial{" +
                "capacidade=" + capacidade +
                ", sala='" + sala + '\'' +
                '}';
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
