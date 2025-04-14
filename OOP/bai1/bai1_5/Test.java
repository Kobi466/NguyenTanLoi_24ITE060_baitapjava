package bai1.bai1_5;

public class Test {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("455", "PenRed", 888, 0.08);
        System.out.println(i1);
        System.out.println(i1.getTotal());
        i1.setQty(999);
        i1.setPrice(0.99);
        System.out.println(i1);
        System.out.println(i1.getTotal());
    }
}
