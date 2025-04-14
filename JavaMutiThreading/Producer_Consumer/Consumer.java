package JavaMutiThreading.Producer_Consumer;

public class Consumer extends Thread {
    private int id;
    private Buffer buffer;
    public Consumer(int id, Buffer buffer) {
        this.id = id;
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while(true){
           if(buffer.getSl()>0&&buffer.getDungLuongToiDa()>0) {
               this.buffer.removeProduct(this.id);
               try {
                   this.sleep(5000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }else{
               System.out.println("Khong con san pham");
               try {
                   this.sleep(10000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        }
    }
}
