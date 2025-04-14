package bai3.bai3_6;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        System.out.println(ball);
        Container box = new Container(0, 0, 100, 100);
        for(int i=0; i<100; i++){
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }
    }
}
