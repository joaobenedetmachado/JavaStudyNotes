package CursoUdemy.Interfaces;

public class Carro {
    private String modelo;
    private double tempo;
    private double valorDiario = 10;
    private double dias = 0;

    public double valorTotal() {
        if (this.tempo <= 12) {
            return this.tempo * 5;
        }
        double dias = this.tempo % 24;
        return dias * valorDiario;
    }


    public Carro(String modelo, double tempo) {
        this.modelo = modelo;
        this.tempo = tempo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
}
