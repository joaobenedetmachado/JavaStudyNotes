package CursoUdemy.Banco;

public class Usuario {
    private String name;
    private int ID;
    private double value;

    public Usuario(int ID, String name, double value) {
        this.name = name;
        this.ID = ID;
        this.value = value;
    }

    public Usuario(int ID, String name) {
        this.name = name;
        this.ID = ID;
        this.value = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addValue(double value) {
        this.value = this.value + value;
    }

    public double getValue() {
        return value;
    }

    public int getID() {
        return ID;
    }

    public void removeValue(double value) {
        if (this.value < value) {
            System.out.println("Voce nao possui isso nao sua conta");
        } else {
            this.value = this.value - value;
        }
    }

    public String toString() {
        return "NOME: " + this.name + " ID: " + this.ID + " VALOR: " + this.value;
    }
}
