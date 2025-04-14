package bai2.bai2_8;

public class Test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(4,2);
        MyCircle c1 = new MyCircle(p1,4);
        MyCircle c2 = new MyCircle(new MyPoint(2,7),2);
        MyCircle c3 = new MyCircle(3,5,8);

        System.out.println(c1.getCenter());
        c1.setCenterXY(3,2);
        System.out.println(c1.getCenterX());
        c1.setCenterX(7);
        c1.setCenterY(5);
        System.out.println(c1);
        System.out.println(c1.getCenterXY()[0]);
        System.out.println(c1.getCenterXY()[1]);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c2.distance(c1));

    }
}

