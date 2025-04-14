package bai2.bai2_10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getArea() {
        int width = topLeft.getX() - bottomRight.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }

    public int getPerimeter() {
        int width = topLeft.getX() - bottomRight.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return (width + height) * 2;
    }
    public String toString() {
        return topLeft.toString() + " " + bottomRight.toString();
    }

    public void draw() {
        System.out.println("Hình chữ nhật với góc trên bên trái (" +
                topLeft.getX() + "," + topLeft.getY() + ") và góc dưới bên phải (" +
                bottomRight.getX() + "," + bottomRight.getY() + ")");
    }
}

