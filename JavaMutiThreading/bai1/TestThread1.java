package JavaMutiThreading.bai1;
 class Number extends Thread {
    String name;
    int n;
    public Number(String name, int n) {
        this.name = name;
        this.n = n;
    }
    @Override
    public synchronized void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println(this.name+" "+(this.n*i));
        }
        try {
            this.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
public class TestThread1 {
    public static void main(String[] args) throws InterruptedException {
        Number thread1 = new Number("A", 2);
        Number thread2 = new Number("B", 3);
        thread1.start();
        thread2.join();
        thread2.start();

    }
}
