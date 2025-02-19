package CursoUdemy.Estoque;

public class Main {
    public static void main(String[] args) {
        Produto x1 = new Produto();
        x1.nome = "maca";
        x1.price = 2.50;
        x1.addProduct(10);
        x1.addProduct(10);
        System.out.println(x1);
        x1.TotalValueInStock();
        x1.removeProduct(5);
        System.out.println(x1);
        x1.TotalValueInStock();

    }
}
