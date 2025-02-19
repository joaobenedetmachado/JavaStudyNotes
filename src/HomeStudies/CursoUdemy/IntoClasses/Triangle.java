package CursoUdemy.IntoClasses;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double getArea() {
        double px = (a + b + c) / 2;
        return Math.sqrt(px * (px - a) * (px - b) * (px - c));
    }
}
