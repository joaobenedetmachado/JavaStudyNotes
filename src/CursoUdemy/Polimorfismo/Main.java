package CursoUdemy.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        gato gato = new gato();
        cachorro cachorro = new cachorro();

        cachorro.fazerSom();
        gato.fazerSom();

        // aqui esta um exemplo de polimorfismo, onde o mesmo metodo (fazerSom) é executado de formas diferente
        // entre as classes
    }
}
