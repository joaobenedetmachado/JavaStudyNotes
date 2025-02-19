package CursoUdemy.Rectangle;

public class Rectangle {
    public double height;
    public double width;

    public double area() {
        return this.height * this.width;
    }

    public double perimeter() {
        return 2 * this.height + this.width;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return "Area: " + this.area() +
                " Perimeter: " + this.perimeter() +
                " Diagonal: " + this.diagonal();

    }
}
