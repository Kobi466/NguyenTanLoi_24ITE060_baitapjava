package bai6.bai6_3;

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(8, 7, 5, 10);

        Movable p = new MovablePoint(4,5,4,2);
        System.out.println(p);
        p.moveUp();
        System.out.println(p);

        System.out.println("Initial Position: " + point);

        point.moveUp();
        System.out.println("After moveUp: " + point);

        point.moveDown();
        System.out.println("After moveDown: " + point);

        point.moveLeft();
        System.out.println("After moveLeft: " + point);

        point.moveRight();
        System.out.println("After moveRight: " + point);
    }
}

