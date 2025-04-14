package Week2_EXMultiThreading.Bai2;

public class Print extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >=0; --i) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Print print = new Print();
        print.start();
    }

}


