package atividades.ex001;

public class Candidato {
    private String nome;
    private Integer quantidadeVotos = 0;

    public Candidato(String nome, Integer quantidadeVotos) {
        this.nome = nome;
        this.quantidadeVotos = quantidadeVotos;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", quantidadeVotos=" + quantidadeVotos +
                '}';
    }

    public Candidato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(Integer quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    public void aumentarVoto() {
        this.quantidadeVotos++;
    }
}
