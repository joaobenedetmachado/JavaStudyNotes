package Ex001.models;

public class CursoHibrido extends Cursos {
    private String dias_semana;
    private int numero_aulas;

    public CursoHibrido(int codigo, String titulo, String nome_instrutor, int carga_horaria, double valor_base, String dias_semana, int numero_aulas) {
        super(codigo, titulo, nome_instrutor, carga_horaria, valor_base);
        this.dias_semana = dias_semana;
        this.numero_aulas = numero_aulas;
    }

    public String getDias_semana() {
        return dias_semana;
    }

    public void setDias_semana(String dias_semana) {
        this.dias_semana = dias_semana;
    }

    public int getNumero_aulas() {
        return numero_aulas;
    }

    public void setNumero_aulas(int numero_aulas) {
        this.numero_aulas = numero_aulas;
    }

    public double CalcularCustos() {
        return getCarga_horaria() * (getValor_base() * 1.15);
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
                "nr aulas=" + numero_aulas +
                ", dias da semana='" + dias_semana + '\'' +
                '}';
    }
}
