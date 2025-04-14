package bai6.bai6_4;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + "), (" + xSpeed + ", " + ySpeed + ")";
    }
    public void moveUp() {
        x += xSpeed;
    }
    public void moveDown() {
        x -= xSpeed;
    }
    public void moveLeft() {
        y += ySpeed;
    }
    public void moveRight() {
        y -= ySpeed;
    }


}

