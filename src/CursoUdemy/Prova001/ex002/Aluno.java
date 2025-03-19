package atividades.ex002;

public class Aluno {
    private String nome;
    private Integer idade;
    private String Categoria;

    public Aluno() {}

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, Integer idade, String categoria) {
        this.nome = nome;
        this.idade = idade;
        Categoria = categoria;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}
