package bai4.bai4_4;

public class Test {
    public static void main(String[] args) {
        //Test class Poin
        Point p = new Point(4.3f, 3.2f);
        System.out.println(p);
        System.out.println("y="+p.getX());
        System.out.println("x="+p.getY());
        //Dat gia tri moi
        p.setXY(2.0f, 4.6f);
        System.out.println(p);
        float[] test  = p.getXY();
        System.out.println("x="+test[1]+",y="+test[0]);
        System.out.println("______________________");
        //Test class MovablePoint
        MovablePoint m = new MovablePoint(1.2f,3.1f,2.4f,1.4f);
        System.out.println(m);
        System.out.println("x="+m.getX());
        m.setSpeed(5.4f,5.7f);
        System.out.println(m);
        System.out.println("xspeed="+m.getSpeedx());
        m.setX(4.2f);
        System.out.println("sau khi thiet lap y="+m.getX());
        m.setXY(48.7f,9.5f);
        System.out.println(m);
        float[] mang = m.getXY();
        System.out.println("x="+mang[0]+",y="+mang[1]);
        m.move();
        System.out.println(m);


    }

}
