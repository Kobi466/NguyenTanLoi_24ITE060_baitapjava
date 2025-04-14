package bai5.bai5_1;

public class TestLineSub {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println("Poin ban dau:"+p);
        p.setX(3);
        System.out.println("Poin thay doi x:"+p);
        p.setY(4);
        System.out.println("Poin thay doi y:"+p);
        System.out.println(p);
        p.setXY(5, 6);
        System.out.println("Poin thay doi x y:"+p);
        System.out.println("--------------");
        LineSub ls = new LineSub(1,2,3,4);
        System.out.println(ls);
        //Set begin end thong poin cho lineSub C1
        LineSub ls1 = new LineSub(new Point(6,4),new Point(7,8));
        System.out.println(ls1);
        //cach2
        Point p1 = new Point(10,9);
        ls = new LineSub(p1,p1);
        System.out.println(ls);
        ls.setBegin(p1.getX(),p1.getY());
        System.out.println(ls);
        //thay doi begin
        ls.setBegin(23,32);
        System.out.println(ls);
        //thay doi end
        ls.setEnd(12,21);
        System.out.println(ls);
        //xem begin va end
        System.out.println(ls.getBegin());
        System.out.println(ls.getEnd());
        //set diem bat dau ket thuc tung cai x y
        ls.setBeginX(32);
        System.out.println(ls);
        System.out.println(ls.getBeginX());
        ls.setEndX(122);
        System.out.println(ls);
        System.out.println(ls.getEndX());
        ls.setBeginY(3233);
        System.out.println(ls);
        System.out.println(ls.getBeginY());
        ls.setEndY(123);
        System.out.println(ls);
        System.out.println(ls.getEndY());

        System.out.println(ls.getLength());
        System.out.println(ls.getGradient());







    }
}

