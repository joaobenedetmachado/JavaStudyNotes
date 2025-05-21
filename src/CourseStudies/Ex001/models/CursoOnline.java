package Ex001.models;

public class CursoOnline extends Cursos {

    private String plataforma;
    private double tempo_duracao;

    public CursoOnline(int codigo, String titulo, String nome_instrutor, int carga_horaria, double valor_base, String plataforma, double tempo_duracao) {
        super(codigo, titulo, nome_instrutor, carga_horaria, valor_base);
        this.plataforma = plataforma;
        this.tempo_duracao = tempo_duracao;
    }



    public double CalcularCustos() {
        return getCarga_horaria() * (getValor_base() * 1.10);
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
                "tempo duracao=" + tempo_duracao +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getTempo_duracao() {
        return tempo_duracao;
    }

    public void setTempo_duracao(double tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }
}
