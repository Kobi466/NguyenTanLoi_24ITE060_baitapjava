package bai5.bai5_2;

class Cylinder {
    private Circle base;
    private double height;


    public Cylinder() {
        base = new Circle();  // Khởi tạo đối tượng Circle
        height = 1.0;
    }


    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return base.getArea() * height;
    }


    public String getBaseColor() {
        return base.getColor();
    }


    public double getBaseRadius() {
        return base.getRadius();
    }
}
