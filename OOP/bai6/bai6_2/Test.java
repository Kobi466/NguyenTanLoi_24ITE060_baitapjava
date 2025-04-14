package bai6.bai6_2;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.3,5);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println();
        Circle c = new Circle(4.3);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}

