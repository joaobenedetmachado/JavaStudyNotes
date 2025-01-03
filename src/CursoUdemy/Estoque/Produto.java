package CursoUdemy.Estoque;

public class Produto {
    public String nome;
    public double price;
    public int quantidade;

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

    public void getStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco total: " + this.price);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
