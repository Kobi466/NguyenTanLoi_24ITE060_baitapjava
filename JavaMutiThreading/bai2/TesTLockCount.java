package JavaMutiThreading.bai2;
class Clock{
    private int giay =0;
    private int phut=0;
    private int gio=0;
    public synchronized void increment(){
        this.giay++;
        if(this.giay==60){
            this.phut++;
            this.giay=0;
            if(this.phut==60){
                this.gio++;
                this.phut=0;
                if(this.gio==24){
                    this.gio=0;
                }
            }
        }
        this.displayTime();
    }
    public synchronized void displayTime() {
        System.out.printf("⏰ %02d:%02d:%02d\n", gio, phut, giay);
    }
}
class SecondCounter implements Runnable {
    private final Clock clock;

    public SecondCounter(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                clock.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TesTLockCount {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Thread secondThread = new Thread(new SecondCounter(clock), "SecondCounter");
        secondThread.start();
    }
}
