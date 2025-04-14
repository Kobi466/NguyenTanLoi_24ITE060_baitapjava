package bai8.bai8_1;

import bai2.bai2_10.MyRectangle;

public class Test {
    public static void main(String[] args) {
                //dung luong
                MyIntStack stack = new MyIntStack(3);

                // add
                System.out.println("Thêm phần tử 10 vào stack.");
                stack.push(10);

                System.out.println("Thêm phần tử 20 vào stack.");
                stack.push(20);

                System.out.println("Thêm phần tử 30 vào stack.");
                stack.push(30);

                // Lấy phần tử trên cùng mà không xóa (peek)
                System.out.println("Phần tử trên cùng (peek): " + stack.peek());

                // Lấy phần tử trên cùng và xóa (pop)
                System.out.println("Lấy phần tử (pop): " + stack.pop());
                System.out.println("Phần tử trên cùng sau khi pop (peek): " + stack.peek());

                // Kiểm tra ngăn xếp rỗng
                System.out.println("Stack rỗng? " + stack.isEmpty());

                // Kiểm tra stack đầy
                System.out.println("Stack đầy? " + stack.isFull());

    }
}
