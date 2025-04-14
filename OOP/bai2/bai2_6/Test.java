package bai2.bai2_6;

public class Test {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(3, 4);
        System.out.println(m1.distance(4, 5));

        MyPoint m2 = new MyPoint(5, 6);
        System.out.println(m1.distance(m2));

        System.out.println(m2.distance());

        m2.setXY(3, 0);
        System.out.println(m2);
        System.out.println(m2.getXY()[0]);
        System.out.println(m2.getXY()[1]);

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i, i);
            System.out.println(points[i]);
        }
    }
}
