package bai6.bai6_4;

public class MovabeCircle implements Movable {
    int radius;
    MovablePoint center;
    public MovabeCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return center.toString() + " " + radius;
    }
    @Override
    public void moveUp(){
        this.center.moveUp();
    }
    @Override
    public void moveDown(){
        this.center.moveDown();
    }
    @Override
    public void moveLeft(){
        this.center.moveLeft();
    }
    @Override
    public void moveRight(){
        this.center.moveRight();
    }
}

