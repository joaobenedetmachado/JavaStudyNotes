package CursoUdemy.EstoqueComConstrutor;

public class Produto {
    public String nome;
    public double price;
    public int quantidade;

    public Produto(String nome, double price, int quantidade) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.price = price;
    }

    public Produto(String nome, double price) {
        this.quantidade = 30;
        this.nome = nome;
        this.price = price;
    }

    public double TotalValueInStock() {
        return this.price * this.quantidade;
    }
    public void addProduct(int a) {
        this.quantidade = this.quantidade + a;
    }
    public void removeProduct(int b) {
        if (this.quantidade < b) {
            System.out.println("Sem produto no estoque para remover");
        } else {
            this.quantidade = this.quantidade - b;
        }
    }

    public String toString() {
        return "Nome: " + this.nome + " Preco total: " + this.TotalValueInStock() + " Quantidade: " + this.quantidade;
    }
}
