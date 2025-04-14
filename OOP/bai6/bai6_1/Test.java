package bai6.bai6_1;

public class Test {
    public static void main(String[] args) {
        //Shape s1 = new Shape(); khong su dung duoc
        //Class nao co abstract khong the tao ra object moi
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); // Class Shape phai co phuong thuc abstract getRadius va bat buoc 2 lop con phai co 2 phuong thuc do


        System.out.println("-------------------------");


        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        System.out.println("----------------");
//        Shape s2 = new Shape(); loi

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
//        s3.setHeight(4);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getHeight());


        System.out.println("------------------");



        Rectangle r1 = (Rectangle)s3;   // ep kieu, tinh da hinh
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getHeight());
        r1.setHeight(5);

        System.out.println("--------------------");


        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
//        s4.setSide(4);

        System.out.println("---------------");
        // Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;//Square la lop con cua Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide());
        System.out.println(r2.getHeight());
        r2.setHeight(5);

        System.out.println("--------------");
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getHeight());
        sq1.setSide(3);
    }
}
