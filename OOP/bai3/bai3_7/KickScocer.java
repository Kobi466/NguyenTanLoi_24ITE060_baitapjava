package bai3.bai3_7;

public class KickScocer {
    public static void main(String[] args) {

        Ball soccerBall = new Ball(5.0f, 3.0f, 0.0f);
        System.out.println("Initial ball position: " + soccerBall.toString());
        Player player1 = new Player(10, 4.0f, 2.0f);
        Player player2 = new Player(7, 12.0f, 5.0f);
        System.out.println("Player 1 near the ball? " + player1.near(soccerBall));
        System.out.println("Player 2 near the ball? " + player2.near(soccerBall));
        player1.move(1.0f, 1.0f);
        System.out.println("Player 1 moves to (" + player1 + ", " + player1 + ")");
        player1.jump(2.0f);
        System.out.println("Player 1 jumps to z = " + player1);
        player1.kick(soccerBall,5.0f);
        System.out.println("Ball position after kick: " + soccerBall.toString());

    }
}
