package bai8.bai8_1;

class MyIntStack {
    int[] contents;
    private int tos;
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }
    public void push(int element) {
        if (isFull()) {
            throw new IllegalStateException("Ngăn xếp đã đầy");//thiet lap ngoai le tuy chinh
        }
        contents[++tos] = element;
    }

    public int pop() {
        return contents[tos--];
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }
}
