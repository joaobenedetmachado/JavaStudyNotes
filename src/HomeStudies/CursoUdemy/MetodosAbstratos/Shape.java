package CursoUdemy.MetodosAbstratos;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double Area() {
        return 0;
    }
}
