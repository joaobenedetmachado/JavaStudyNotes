package exercicio_2.models;

public abstract class Servicos {
    private Integer codigo;
    private String descricao;
    private String tecnico_responsavel;

    public Servicos() {}

    public Servicos(Integer codigo, String descricao, String tecnico_responsavel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tecnico_responsavel = tecnico_responsavel;
    }

    @Override
    public String toString() {
        return "Servicos{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", tecnico_responsavel='" + tecnico_responsavel + '\'' +
                '}';
    }

    public String CalcularValorTotal() {
        return "0";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTecnico_responsavel() {
        return tecnico_responsavel;
    }

    public void setTecnico_responsavel(String tecnico_responsavel) {
        this.tecnico_responsavel = tecnico_responsavel;
    }
}
