package JavaMutiThreading.SystemSellTicket;
class Ticket{
    static int sl;
    Ticket(int sl){
        this.sl=sl;
    }
    synchronized void sell(){
            if(sl>0){
                this.sl--;
                System.out.println(Thread.currentThread().getName()+ " Da ban thanh cong, va so ve con lai hien tai: "+this.sl);
            }else{
                System.out.println("Hết vé rồi ní");
            }
        }
    }
class NguoiMua implements Runnable{
    Ticket ve;

    public NguoiMua(Ticket ve) {
        this.ve = ve;
    }

    @Override
    public void run() {
        for(int i=0; i<25;++i){
            ve.sell();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SellTicket {
    public static void main(String[] args) {
        Ticket ve = new Ticket(50);
        Thread th1 = new Thread(new NguoiMua(ve), "A");
        Thread th2 = new Thread(new NguoiMua(ve), "B");
        th1.start();
        th2.start();

    }
}
