package Week2_EXMultiThreading.Bai1_Count;
class Print{
    private final int MAX = 10;
    private final Object lock = new Object();
    private int count = 0;
    public  void inLe() throws InterruptedException {
        while (count < MAX) {
            synchronized (lock) {
                while (count < MAX) {
                    while (count % 2 == 0) {
                        lock.wait();
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + ":" + count);
                    lock.notify();
                }
            }
        }
    }
    public void inChan() throws InterruptedException {
        while (count < MAX) {
            synchronized (lock) {
                while(count%2!=0){
                    lock.wait();
                }
                count++;
                System.out.println(Thread.currentThread().getName()+":"+count);
                lock.notify();
            }
        }
    }
    public static void main(String[] args) {
        Print print = new Print();
        Thread t1 = new Thread(() -> {
            try {
                print.inLe();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "A");
        Thread t2 = new Thread(() -> {
            try{
                print.inChan();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }, "B");
        t1.start();
        t2.start();
    }
}


