package bai3.bai3_1;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        MyComplex m = new MyComplex(a, b);
        MyComplex m2 = new MyComplex(c, d);
        System.out.println("So phuc thu nhat: "+ m);
        System.out.println("So phuc thu hai: "+ m2);
        System.out.println("Kiem tra so phuc thu nhat");
        kiemTra(m);
        System.out.println("Kiem tra so phuc thu hai");
        kiemTra(m2);
        System.out.println("So sanh 2 so phuc minh tu setup: "+m.equals(3.4,2));
        System.out.println("So sanh 2 so phuc goi bang obj: "+m.equals(m2));
        System.out.println("So goc cua so phuc 1: "+m.argument());
        System.out.println("So goc cua so phuc 2: "+m2.argument());
        System.out.println("Cong 2 so phuc tra ve so phuc moi: "+m.addInto(m2));//tra ve m moi return this;
        System.out.println(m2.addNew(m));
        System.out.println(m2.addNew(m2));
        System.out.println(m.addNew(m2));

        System.out.println("Do dai so phuc 1: "+m.magnitude());
        System.out.println("Do dai so phuc 2: "+m2.magnitude());

        System.out.println("So phuc thu nhat: "+ m);
        System.out.println("So phuc thu hai: "+ m2);
        System.out.println("Tru 2 so phuc tra ve so phuc moi: "+m.subtract(m2));//return this;
        System.out.println(m2.subtract(m));


        System.out.println("So phuc thu nhat: "+ m);
        System.out.println("So phuc thu hai: "+ m2);
        System.out.println("Phep nhan so phuc: "+m.multiply(m2));
        System.out.println("Phep chia so phuc: "+m.divide(m2));
        System.out.println("So phuc 1 doi: "+m.conjugate());
        System.out.println("So phuc 2 doi: "+m2.conjugate());
    }


private static void kiemTra(MyComplex m){
             if(m.isReal()){
                 System.out.println(m+" La so thuc");
             }
             else{
                 System.out.println(m+" Khong phai so thuc");
             }

             if(m.isImaginary()){
                 System.out.println(m+" La so thuan ao");
             }
             else{
                 System.out.println(m+" Khong phai so thuan ao");
             }
    }



}

