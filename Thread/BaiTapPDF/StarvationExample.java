package Week2_EXMultiThreading.BaiTapPDF;

public class StarvationExample {
    public static void main(String[] args) throws InterruptedException {
        Thread highPriority = new Thread(() -> {
            while (true) {
                System.out.println("High priority thread running...");
            }
        });

        Thread lowPriority = new Thread(() -> {
            while (true) {
                System.out.println("Low priority thread running...");
                Thread.yield(); // Nhường CPU
            }
        });

        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);

        highPriority.start();
        highPriority.join();
        lowPriority.start();
    }
}

