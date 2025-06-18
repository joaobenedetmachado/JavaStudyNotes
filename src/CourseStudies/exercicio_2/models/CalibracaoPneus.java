package exercicio_2.models;

public class CalibracaoPneus extends Servicos{
    private String formato;
    private Double tempo_duracao;
    private double valor;

    public CalibracaoPneus() {}

    public CalibracaoPneus(Integer codigo, String descricao, String tecnico_responsavel, String formato, Double tempo_duracao, double valor) {
        super(codigo, descricao, tecnico_responsavel);
        this.formato = formato;
        this.tempo_duracao = tempo_duracao;
        this.valor = valor;
    }

    public String CalcularValorTotal() {
        return "TOTAL CALIBRACAO PNEU: " + this.tempo_duracao * this.valor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Double getTempo_duracao() {
        return tempo_duracao;
    }

    public void setTempo_duracao(Double tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
