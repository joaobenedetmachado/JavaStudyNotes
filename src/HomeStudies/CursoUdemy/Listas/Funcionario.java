package CursoUdemy.Listas;

public class Funcionario {
    private int ID;
    private String nome;
    private double salary;

    public Funcionario(int ID, String nome, double salary) {
        this.ID = ID;
        this.nome = nome;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return ID + " " + nome + " " + salary;
    }
}
