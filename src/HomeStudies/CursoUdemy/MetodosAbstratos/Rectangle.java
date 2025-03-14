package CursoUdemy.MetodosAbstratos;

public class Rectangle extends Shape {
    private double height;
    private double widht;

    public Rectangle(Color color, double height, double widht) {
        super(color);
        this.height = height;
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", widht=" + widht +
                '}';
    }
}
