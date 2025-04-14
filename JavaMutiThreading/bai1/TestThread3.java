package JavaMutiThreading.bai1;
class InSo{
    private int i=1;
    private final int MAX=10;
    public synchronized void soLe() {
        while (i < MAX) {
            while (i % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("So le: " + i);
            i++;
            notify();
        }
    }

    public synchronized void soChan() {
        while (i <= MAX) {
            while (i % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("So chan: " + i);
            i++;
            notify();
        }
    }
}
class SoChan extends Thread{
    private InSo print;

    public SoChan(InSo print) {
        this.print=print;
    }

    @Override
    public void run() {
        this.print.soChan();
    }
}
class SoLe implements Runnable{
    private InSo print;
    public SoLe(InSo print) {
        this.print=print;
    }
    @Override
    public void run() {
        this.print.soLe();
    }
}
public class TestThread3 {
    public static void main(String[] args) {
        InSo print = new InSo();
        SoChan soChan = new SoChan(print);
        SoLe soLe = new SoLe(print);
        Thread thread1  = new Thread(soChan);
        Thread thread2  = new Thread(soLe);
        thread1.start();
        thread2.start();
    }
}
