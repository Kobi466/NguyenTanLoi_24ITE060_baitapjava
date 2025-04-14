package bai6.bai6_8;


public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return center.toString() + " " + radius;
    }
    @Override
    public void moveUp(){
        center.x+=center.xSpeed;
    }
    @Override
    public void moveDown(){
        center.x-=center.xSpeed;
    }
    @Override
    public void moveLeft(){
        center.y+=center.ySpeed;
    }
    @Override
    public void moveRight(){
        center.y-=center.ySpeed;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}



