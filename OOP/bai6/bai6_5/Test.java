package bai6.bai6_5;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println();
        ResizableCircle r = new ResizableCircle(4.5);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        r.resize(50);
        System.out.println(r);
    }
}

