package bai4.bai4_1;

import java.awt.*;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder() {
        super();
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    public String toString() {
        return super.toString()+ " height=" + height;
    }
}
