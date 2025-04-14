package JavaMutiThreading.Producer_ConsumerProblem;

public class Producer implements Runnable{
    private String name;
    private Buffer buffer;

    public Producer(String name, Buffer buffer) {
        this.name = name;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i=0;
        while(buffer.getCapacity()>0){
            try {
                Thread.sleep(1000);
                buffer.addProduct(this.name,i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
