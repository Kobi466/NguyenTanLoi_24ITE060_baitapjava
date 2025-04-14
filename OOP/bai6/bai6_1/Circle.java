package bai6.bai6_1;

public class Circle extends Shape {
    protected double radius;
    public Circle() {
        super();
        radius = 1.0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle ["+super.toString()+",radius=" + radius + "]";
    }
    //Class Shape muon lay getHeight va da khai bao phuong thuc abstract getHeight
    public double getHeight(){
        return 0;
    }
    public double getSide(){
        return 0;
    }




}

