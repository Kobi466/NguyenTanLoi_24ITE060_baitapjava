package bai5.bai5_2;

public class Test {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1:");
        System.out.println("Bán kính đáy: " + cylinder1.getBaseRadius());
        System.out.println("Chiều cao: " + cylinder1.getHeight());
        System.out.println("Màu sắc: " + cylinder1.getBaseColor());
        System.out.println("Thể tích: " + cylinder1.getVolume());


        Cylinder cylinder2 = new Cylinder(3.0, 5.0, "blue");
        System.out.println("\nCylinder 2:");
        System.out.println("Bán kính đáy: " + cylinder2.getBaseRadius());
        System.out.println("Chiều cao: " + cylinder2.getHeight());
        System.out.println("Màu sắc: " + cylinder2.getBaseColor());
        System.out.println("Thể tích: " + cylinder2.getVolume());

        cylinder2.setHeight(11.0);
        System.out.println("Thể tích:  "+ cylinder2.getVolume());



    }
}

