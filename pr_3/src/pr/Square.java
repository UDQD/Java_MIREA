package pr;

public class Square extends Rectangle {
    public Square() {
        this.length = 1;
        this.width = 1;
    }

    ;

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    ;

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    ;

    public double getSide() {
        return this.length;
    }

    ;

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    ;

    public void setWidth(double side) {
        this.width = side;
    }

    ;

    public void setLength(double side) {
        this.length = side;
    }

    ;

//    public String toString() {
//        return "Square";
//    }


    @Override
    public String toString() {
        return super.toString();
    }

    ;
}
