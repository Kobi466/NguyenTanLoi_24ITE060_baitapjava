package JavaMutiThreading.Producer_ConsumerProblem;

public class Consumer implements Runnable{
    private String name;
    private Buffer buffer;

    public Consumer(String name, Buffer buffer) {
        this.name = name;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i=0;
        while(buffer.getCapacity()>0){
            try {
                buffer.removeProduct(this.name);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
