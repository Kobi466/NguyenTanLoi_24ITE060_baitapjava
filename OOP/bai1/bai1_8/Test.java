package bai1.bai1_8;

public class Test {
    public static void main(String[] args) {
        Time t1 = new Time(0,0,0);
        System.out.println(t1);
        t1.nextTime();
        System.out.println(t1);
        t1.setHour(23);
        t1.setMinute(59);
        t1.setSecond(59);
        System.out.println(t1);
        System.out.println(t1.nextTime());
        System.out.println(t1.previousSecond());
    }
}
