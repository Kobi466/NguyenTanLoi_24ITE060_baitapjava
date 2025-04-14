package JavaMutiThreading.TestTask;


public class Test {
    public static void main(String[] args) {
        System.out.println("--------");
        TaskA t1 = new TaskA();

        Thread t2 = new Thread(new TaskB());
        t1.start();
        t2.start();

    }
}
