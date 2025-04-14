package bai3.bai3_4;

public class Test {
    public static void main(String[] args) {
        MyTime m = new MyTime();
        MyTime m1= new MyTime(3,5,6);
        m1.setTime(1,2,3);
        System.out.println(m1);
        m1.nextSecond();
        System.out.println(m1);
        m1.nextMinute();
        System.out.println(m1);
        m1.nextHour();
        System.out.println(m1);
        m1.setTime(3,59,59);
        System.out.println(m1);
        m1.nextSecond();
        System.out.println(m1);
        m1.previousSecond();
        System.out.println(m1);



    }
}
