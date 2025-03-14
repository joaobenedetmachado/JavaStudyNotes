package CursoUdemy.MetodosAbstratos;

public class Circle extends Shape {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
