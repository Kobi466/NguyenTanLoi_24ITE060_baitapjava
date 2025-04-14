package bai5.bai5_1;

public class TestLine {
    public static void main(String[] args) {
        Line l = new Line (3, 4, 5, 6);
        System.out.println(l);
        System.out.println("-------------------");
        // tao point de thiet lap diem x y bat dau
        Point p = new Point(1,2);
        System.out.println(p);
        l.setBegin(p);
        System.out.println(l);
        System.out.println("-----------------");
        // tao them point de thiet lap x y ket thuc
        Point p1 = new Point (2,3);
        System.out.println(p1);
        l.setEnd(p1);
        System.out.println(l);
        //xem gia tri x y ban dau va ket thuc
        System.out.println("Begin "+l.getBegin()+"-----"+"End "+l.getEnd());
        System.out.println("--------------");
        //thay doi 1 gia tri mong muon
        p.setX(4);
        p.setY(5);
        System.out.println(p);
        l.setBeginX(3);
        System.out.println(l);
        l.setBeginY(4);
        System.out.println(l);
        l.setEndX(5);
        System.out.println(l);
        l.setEndY(6);
        System.out.println(l);
        System.out.println("------------");
        // thiet lap gia tri ban dau x y/ thiet lap gia tri x y ket thuc
        l.setBeginXY(4, 5);
        l.setEndXY(5, 6);
        System.out.println(l);
        System.out.println(l.getLength());
        System.out.println(l.getGrandient());





    }
}

