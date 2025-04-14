package bai1.bai1_5;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double price;

    public InvoiceItem(String id, String desc, int qty, double price) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return price * qty;
    }

    public String toString(){
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", price=" + price + "]";
    }
}
