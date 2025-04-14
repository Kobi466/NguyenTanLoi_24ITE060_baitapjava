package bai6.bai6_4;

public class Test {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(6, 7, 8, 9);
        System.out.println(mp);
        System.out.println();
        mp.moveUp();
        System.out.println(mp);
        mp.moveDown();
        System.out.println(mp);
        mp.moveLeft();
        System.out.println(mp);
        mp.moveRight();
        System.out.println(mp);
        System.out.println();
        MovabeCircle mc = new MovabeCircle(4,3,5,6,4);
        System.out.println(mc);
        mc.moveUp();
        System.out.println(mc);
        mc.moveDown();
        System.out.println(mc);
        mc.moveLeft();
        System.out.println(mc);
        mc.moveRight();
        System.out.println(mc);








    }

}

