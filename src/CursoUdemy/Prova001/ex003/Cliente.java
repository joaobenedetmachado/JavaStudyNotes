package atividades.ex003;

public class Cliente {
    private Integer NumeroConta;
    private String nome;
    private Double saldoConta;

    public Cliente () {}

    public Cliente(Integer numeroConta, String nome, Double saldoConta) {
        NumeroConta = numeroConta;
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NumeroConta=" + NumeroConta +
                ", nome='" + nome + '\'' +
                ", saldoConta=" + saldoConta +
                '}';
    }

    public Integer getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
