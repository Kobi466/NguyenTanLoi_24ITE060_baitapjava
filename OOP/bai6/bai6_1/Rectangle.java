package bai6.bai6_1;

public class Rectangle extends Shape{
    protected double width;
    protected double height;
    public Rectangle() {
        width=1.0;
        height=1.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    // theo lop cha abstract
    public double getHeight() {
        return height;
    }
    //
    public double getRadius(){
        return 0;
    }
    //
    public double getSide(){
        return 0;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return (width+height)*2;
    }
    @Override
    public String toString() {
        return "Ractangle["+super.toString()+", width="+width+", height="+height+"]]";
    }

}

