package JavaMutiThreading.bai1;

class Thread2 {
    private int i = 1;
    private final int MAX = 10;

    public synchronized void soLe() {
        while (i < MAX) {
            while (i % 2 == 0) { // Nếu là số chẵn, đợi
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("So le: " + i);
            i++;
            notify(); // Đánh thức luồng số chẵn
        }
    }

    public synchronized void soChan() {
        while (i <= MAX) {
            while (i % 2 != 0) { // Nếu là số lẻ, đợi
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("So chan: " + i);
            i++;
            notify(); // Đánh thức luồng số lẻ
        }
    }
}

public class TestThread2 {
    public static void main(String[] args) {
        Thread2 thread = new Thread2();

        Thread thr1 = new Thread(thread::soChan);
        Thread thr2 = new Thread(thread::soLe);

        thr1.start();
        thr2.start();
    }
}
