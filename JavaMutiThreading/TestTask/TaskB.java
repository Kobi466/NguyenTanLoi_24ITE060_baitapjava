package JavaMutiThreading.TestTask;

import static java.lang.Thread.sleep;

public class TaskB implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("BBB");
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
