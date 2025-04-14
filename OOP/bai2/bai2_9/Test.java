package bai2.bai2_9;

public class Test {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(1, 2, 3, 4, 5, 6);
        System.out.println(triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Type: " + triangle.getType());
    }
}

