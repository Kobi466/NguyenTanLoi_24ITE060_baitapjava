package bai6.bai6_8;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(xSpeed, ySpeed, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }

    @Override
    public void moveDown() {
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;

    }
    @Override
    public String toString() {
        return topLeft.toString() + " " + bottomRight.toString();
    }
}
