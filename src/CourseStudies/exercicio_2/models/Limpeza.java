package exercicio_2.models;

public class Limpeza extends Servicos{
    private String tipo;
    private Double tempo_duracao;
    private Double valor;

    public Limpeza() {}

    public Limpeza(Integer codigo, String descricao, String tecnico_responsavel, String tipo, Double tempo_duracao, Double valor) {
        super(codigo, descricao, tecnico_responsavel);
        this.tipo = tipo;
        this.tempo_duracao = tempo_duracao;
        this.valor = valor;
    }

    public String CalcularValorTotal() {
        return "TOTAL LIMPEZA: " + this.tempo_duracao * this.valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTempo_duracao() {
        return tempo_duracao;
    }

    public void setTempo_duracao(Double tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
