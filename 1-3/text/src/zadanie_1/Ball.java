package zadanie_1;

public class Ball {
    private String name;
    private double weight;
    private int coord[] = new int[2];

    public Ball() {
        this.name = "Some Ball";
        this.weight = 0.5;
        this.coord[0] = 0;
        this.coord[1] = 0;
    }

    public Ball(String name, double weight, int x, int y) {
        this.name = name;
        this.weight = weight;
        this.coord[0] = x;
        this.coord[1] = y;
    }

    public void move(int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }

    public String toString() {
        return this.name +' '+ this.weight+' '+ this.coord[0]+' '+this.coord[1];
    }


}
