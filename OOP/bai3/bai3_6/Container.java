package bai3.bai3_6;

public class Container {
   private int x1;
   private int y1;
   private int x2;
   private int y2;
   public Container(int x, int y, int width, int height){
       x1 = x;
       y1 = y;
       x2 = x + width;
       y2 = y + height;
   }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

   public int getWidth() {
       return x2 - x1;
   }
   public int getHeight() {
       return y2 - y1;
   }
   public boolean collides(Ball ball){
       if(ball.getX()-ball.getRadius()<=this.x1 || ball.getX()+ball.getRadius()>=this.x2){
           ball.reflectHorizontal();
           return true;
       }
       return false;
   }
   public String toString(){
       return "Container[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
   }

}
