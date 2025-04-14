package Week2_EXMultiThreading.BaiTapPDF;

class VisibilityExample {
    private static volatile boolean flag = false; // Thêm volatile

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) {} // Bây giờ luồng này sẽ thấy thay đổi của flag
            System.out.println("Flag changed!");
        }).start();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        flag = true; // Luồng chính thay đổi giá trị của flag
    }
}

