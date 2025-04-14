package bai1.bai1_2;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println("----------------------");
        Circle c2 = new Circle(1.9);
        System.out.println(c2);
        c2.setRadius(2.0);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
    }
}
