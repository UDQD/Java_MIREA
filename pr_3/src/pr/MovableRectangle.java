package pr;

public class MovableRectangle implements Movable {
    protected MovablePoint topLeft;
    protected MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    ;

    public void moveUp() {
        this.topLeft.y++;
        this.bottomRight.y++;
    }

    ;

    public void moveDown() {
        this.topLeft.y--;
        this.bottomRight.y--;
    }

    ;

    public void moveLeft() {
        this.topLeft.x--;
        this.bottomRight.x--;
    }

    ;

    public void moveRight() {
        this.topLeft.x++;

        this.bottomRight.x++;
    }

    ;
}
