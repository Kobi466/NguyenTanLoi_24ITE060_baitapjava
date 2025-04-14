package bai4.bai4_3;

public class Test {
    public static void main(String[] args) {
        Point2D pn = new Point2D(4,5);
        System.out.println("Point2D:"+pn);
        Point2D point = new Point2D(3.0f, 4.0f);
        System.out.println("Point2D:"+point);
        float[] coordinates = point.getXY();

        System.out.println("x = " + coordinates[0]);
        System.out.println("y = " + coordinates[1]);
        Point3D pnt = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println(pnt);
        pnt.setXY(4,9);
        System.out.println(pnt);
        pnt.setXYZ(1,3,4);
        System.out.println(pnt);
        pnt.getXY();

        System.out.println("______________________");
        Point3D pnt1 = new Point3D(8.0f, 7.0f, 5.0f);
        System.out.println(pnt1);
        pnt1.setXY(2.0f, 1.0f);
        System.out.println(pnt1);
        pnt1.setXYZ(1,4,5);
        System.out.println(pnt1);
        float[] mang = pnt1.getXYZ();
        System.out.println("mang = " + mang[0]);
        System.out.println("mang = " + mang[1]);
        System.out.println("mang = " + mang[2]);
        float [] mang1 = pnt1.getXY();
        System.out.println("mang1 = " + mang1[0]);
        System.out.println("mang1 = " + mang1[1]);




    }

}

