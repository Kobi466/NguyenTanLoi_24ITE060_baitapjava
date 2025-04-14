package bai1.bai1_3;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        System.out.println("Chieu dai cua hinh chu nhat: "+r.getLength());
        System.out.println("Chieu rong cua hinh chu nhat: "+r.getWidth());
        System.out.println("Dien tich cua hinh chu nhat: "+r.getArea());
        System.out.println("Chu vi cua hinh chu nhat: "+r.getPerimeter());

        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        r2.setLength(20);
        r2.setWidth(20);
        System.out.println("Chieu dai cua hinh chu nhat 2: "+r2.getLength());
        System.out.println("Chieu rong cua hinh chu nhat 2: "+r2.getWidth());
        System.out.println("Dien tich cua hinh chu nhat 2: "+r2.getArea());
        System.out.println("Chu vi cua hinh chu nhat 2: "+r2.getPerimeter());

    }
}
