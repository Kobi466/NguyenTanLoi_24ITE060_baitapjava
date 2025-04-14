package bai5.bai5_1;

public class TestPoint {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);    // Xây dựng một điểm
        System.out.println(p1); // Thử đặt p1 thành (100, 10).
        p1.setX(4);
        p1.setY(5);
        System.out.println(p1);
        p1.setXY(6, 8);
        System.out.println(p1);
    }
}


