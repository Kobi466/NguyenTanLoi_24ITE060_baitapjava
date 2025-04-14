package JavaMutiThreading.Producer_Consumer;

import java.util.ArrayList;

public class Buffer {
    private static int sl;
    // kha nang chua toi da
    private int dungLuongToiDa;
    //Danh sach san pham
    private ArrayList<Integer> products;

    public Buffer(int capacity) {
        this.dungLuongToiDa = capacity;
        this.products = new ArrayList<>();
    }

    public void addProduct(int product, int productId) {
        System.out.println(">>>>---------------------");
        System.out.println("Nha san xuat "+productId+" da them san pham "+product);
        products.add(product);
        System.out.println("So luong ton kho: "+products.size());
    }
    public void removeProduct(int consumerId) {
        System.out.println("<<<<---------------------");
        System.out.println("Khach hang "+consumerId+" da mua san pham "+products.get(0));
        products.remove(0);
        System.out.println("So luong ton kho: "+products.size());
    }
    public int getSl() {
        return this.products.size();
    }
    public int getDungLuongToiDa() {
        return dungLuongToiDa;
    }
}
