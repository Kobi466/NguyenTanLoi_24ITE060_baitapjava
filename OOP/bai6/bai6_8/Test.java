package bai6.bai6_8;

public class Test {
    public static void main(String[] args) {


        Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);// upcast
        //System.out.println(m2.getArea());//vi lop Mavable khong co phuong thuc
        MovableCircle mc = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(mc.getArea());
        System.out.println(m2);
        System.out.println(mc);
        m2.moveUp();
        System.out.println(m2);
        System.out.println();
        Movable m3 = new MovableRectangle(5, 6, 10, 15,34,4);
        MovableRectangle mr = new MovableRectangle(5, 6, 10, 15,34,4);
        m3.moveUp();
        System.out.println(m3);
        System.out.println(mr);



    }

}
