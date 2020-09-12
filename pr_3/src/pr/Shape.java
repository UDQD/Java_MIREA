package pr;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.filled = true;
        this.color = "Pink";
    }

    public Shape(String color, boolean filled) {
    }

    ;

    public String getColor() {
        return this.color;
    }

    ;

    public void setColor(String color) {
        this.color = color;
    }

    ;

    public boolean isFilled() {
        return this.filled;
    }

    ;

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    ;

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return "Shape";
    }

    ;
}