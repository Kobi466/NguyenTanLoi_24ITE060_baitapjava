package bai4.bai4_5;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    @Override
    public String toString(){
        return "Rectangle["+super.toString()+", Width=" + width + ", Height=" + height + "]";
    }
}

