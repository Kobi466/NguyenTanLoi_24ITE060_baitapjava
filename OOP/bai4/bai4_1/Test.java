package bai4.bai4_1;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Hình trụ:"
                + " radius=" + cylinder.getRadius()
                + " height=" + cylinder.getHeight()
                + " base area=" + cylinder.getArea()
                + " volume=" + cylinder.getVolume());
        Cylinder cylinder1 = new Cylinder(10.0);
        System.out.println("Hình trụ:"
                + " radius=" + cylinder1.getRadius()
                + " height=" + cylinder1.getHeight()
                + " base area=" + cylinder1.getArea()
                + " volume=" + cylinder1.getVolume());
        Cylinder cy3 = new Cylinder(2.0, 10.0);
        System.out.println("Hình trụ:"
                + " radius=" + cy3.getRadius()
                + " height=" + cy3.getHeight()
                + " base area=" + cy3.getArea()
                + " volume=" + cy3.getVolume());
    }
}
