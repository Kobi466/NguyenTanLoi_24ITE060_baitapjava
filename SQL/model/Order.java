package SQL.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private Date order_date;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Order_item> order_items = new ArrayList<>();

    public Order() {
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public List<Order_item> getOrder_items() {
        return order_items;
    }

    public void setOrder_items(List<Order_item> order_items) {
        this.order_items = order_items;
    }
}
