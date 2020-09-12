package pr;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this
    };
    @Override
    public String toString(){return "point";};
    public void moveUp(){this.y++;};
    public void moveDown(){this.y--;};
    public void moveLeft(){this.x--;};
    public void moveRight(){this.x++;};




}
