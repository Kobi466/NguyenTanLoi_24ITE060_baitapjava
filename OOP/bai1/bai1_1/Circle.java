package bai1.bai1_1;

public class Circle {
    private double radius;
    private String color;
    public Circle(double r) {
        radius = r;
    }
    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double r, String c) {
        radius = r;
        color=c;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Hinh tron co ban kinh: " + radius + " va co mau " + color;
    }
}
