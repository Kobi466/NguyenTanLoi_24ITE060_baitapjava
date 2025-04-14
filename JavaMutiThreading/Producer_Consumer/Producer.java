package JavaMutiThreading.Producer_Consumer;

public class Producer extends Thread {
    private int id;
    private Buffer buffer;
    public Producer(int id, Buffer buffer) {
        this.id = id;
        this.buffer = buffer;
    }
    @Override
    public void run() {
        int i = 0;
        while(buffer.getDungLuongToiDa()>0) {
                try{
                    buffer.addProduct(i++, this.id);
                    this.sleep(10000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
    }
}
