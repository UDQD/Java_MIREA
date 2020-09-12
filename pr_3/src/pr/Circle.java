package pr;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1;
    }

    ;

    public Circle(double radius) {
        this.radius = radius;
    }

    ;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    ;

    public double getRadius() {
        return this.radius;
    }

    ;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    ;

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    ;

    public String toString() {
        return "Circle";
    }

    ;
}
