package bai6.bai6_1;

public abstract class Shape {
    protected String color;
    protected Boolean filled;
    public Shape() {
        color="red";
        filled=true;
    }
    public Shape(String color, Boolean filled) {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }
    //goi phuong thuc abstract
    public abstract double getRadius();
    public abstract double getHeight();
    public abstract double getSide();
    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }


    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled +"]";
    }

}

