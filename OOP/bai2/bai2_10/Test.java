package bai2.bai2_10;

public class Test {
    public static void main(String[] args) {
        MyPoint m = new MyPoint(4,6);
        MyPoint m2 = new MyPoint(1, 2);
        MyRectangle mr = new MyRectangle(m,m2);
        System.out.println(mr);
        MyRectangle mr2 = new MyRectangle(new MyPoint(1,2),new MyPoint(3,4));
        System.out.println(mr2);
        System.out.println(mr2.getArea());
        System.out.println(mr.getPerimeter());
    }
}

