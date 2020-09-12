package pr;

public abstract class Shape{
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String color, boolean filled){};
    public String getColor(){};
    public void setColor(String color){};
    public boolean isFilled(){};
    public void setFilled(boolean filled){};
    double getArea(){};
    double getPerimeter(){};
    public String toString(){};
}