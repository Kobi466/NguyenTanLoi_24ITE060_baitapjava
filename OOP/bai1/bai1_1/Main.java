package bai1.bai1_1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println("----------------------");
        Circle c2 = new Circle(3.9);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println("Hinh tron c2 co ban kinh: " + c2.getRadius()+" co dien tich: "+c2.getArea());
        System.out.println("-----------------------");
        Circle c3 = new Circle(9, "blue");
        System.out.println(c3);
        c3.setRadius(3.9);
        System.out.println(c3);
        System.out.println(c3.getRadius());
        System.out.println(c3.getArea());
        double chuVi = c.getPerimeter();
        System.out.println(chuVi);
    }
}