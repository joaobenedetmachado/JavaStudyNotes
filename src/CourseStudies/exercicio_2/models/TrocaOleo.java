package exercicio_2.models;

public class TrocaOleo extends Servicos{
    private String marca;
    private Double tempo_duracao;
    private Double valor;

    public TrocaOleo() {}

    public TrocaOleo(Integer codigo, String descricao, String tecnico_responsavel, String marca, Double tempo_duracao, Double valor) {
        super(codigo, descricao, tecnico_responsavel);
        this.marca = marca;
        this.tempo_duracao = tempo_duracao;
        this.valor = valor;
    }

    public String CalcularValorTotal() {
        return "TOTAL TROCA OLEO: " + this.tempo_duracao * this.valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
