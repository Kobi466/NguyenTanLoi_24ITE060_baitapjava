package JavaMutiThreading.Producer_ConsumerProblem;


public class TestSell {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Producer producer = new Producer("ban", buffer);
        Thread th1 = new Thread(producer);
        Consumer consumer = new Consumer("mua", buffer);
        Thread th2 = new Thread(consumer);
        th1.start();
        th2.start();
    }
}
