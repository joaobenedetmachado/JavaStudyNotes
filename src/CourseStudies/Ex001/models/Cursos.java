package Ex001.models;

public abstract class Cursos {
    private int codigo;
    private String titulo;
    private String nome_instrutor;
    private int carga_horaria;
    private double valor_base;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_instrutor() {
        return nome_instrutor;
    }

    public void setNome_instrutor(String nome_instrutor) {
        this.nome_instrutor = nome_instrutor;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public double getValor_base() {
        return valor_base;
    }

    public void setValor_base(double valor_base) {
        this.valor_base = valor_base;
    }

    public Cursos(int codigo, String titulo, String nome_instrutor, int carga_horaria, double valor_base) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.nome_instrutor = nome_instrutor;
        this.carga_horaria = carga_horaria;
        this.valor_base = valor_base;
    }

    protected abstract double CalcularCustos();

    public String MostrarInformacoes() {
        return "Cursos{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", nome_instrutor='" + nome_instrutor + '\'' +
                ", carga_horaria=" + carga_horaria +
                ", valor_base=" + valor_base +
                '}';
    }


}
