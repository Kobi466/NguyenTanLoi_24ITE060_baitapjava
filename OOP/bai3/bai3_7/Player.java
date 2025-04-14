package bai3.bai3_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;
    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public void jump(float zDisp){
        this.z += zDisp;
    }
    public boolean near(Ball ball){
        float distance = (float) Math.sqrt(Math.pow(ball.getX() - x, 2) + Math.pow(ball.getY() - y, 2));
        return distance < 8.0f;
    }
    public void kick(Ball ball, float thanhLuc){
        ball.setXYZ(ball.getX()+thanhLuc, ball.getY()+thanhLuc, ball.getZ()+thanhLuc);
    }
    public String toString(){
        return "Player["+number+"]("+x+", "+y+", "+z+")";
    }

}
