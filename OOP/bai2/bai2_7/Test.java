package bai2.bai2_7;

public class Test {
    public static void main(String[] args) {
        MyPoint m = new MyPoint(4,5);
        System.out.println(m);
        MyPoint m1 = new MyPoint(6,7);
        System.out.println(m.distance(m1));
        System.out.println(m.distance(2,4));
        System.out.println(m.distance());
        m.setXY(4,2);
        System.out.println(m.getXY()[0]);
        System.out.println(m.getXY()[1]);
        System.out.println("------------------");

        MyPoint m2 = new MyPoint(4,5);
        MyPoint m3 = new MyPoint(6,7);
        MyLine ml2 = new MyLine(m2,m3);
        System.out.println(ml2);
        System.out.println("------------------------");

        MyLine ml = new MyLine(3,4,5,6);
        System.out.println(ml.getBegin());
        System.out.println(ml.getEnd());
        ml.setBegin(m2);
        ml.setEnd(m3);
        System.out.println(ml);
        ml.setBeginX(5);
        ml.setBeginY(6);
        ml.setEndX(7);
        ml.setEndY(8);
        System.out.println(ml);
        System.out.println(ml.getBeginX());
        System.out.println(ml.getBeginY());
        System.out.println(ml.getEndX());
        System.out.println(ml.getEndY());
        System.out.println("--------------------");

        ml.setBeginXY(9,10);
        ml.setEndXY(11,12);
        System.out.println(ml.getBeginXY()[0]);
        System.out.println(ml.getBeginXY()[1]);

        System.out.println(ml.getEndXY()[0]);
        System.out.println(ml.getEndXY()[1]);

        System.out.println(ml.getLength());
        System.out.println(ml.getGradient());










    }
}

