package SQL.view;

import SQL.controller.ViewHandler;
import SQL.dao.CustomerDAO;
import SQL.dao.OrderDAO;
import SQL.dao.ProductDAO;
import SQL.model.Customer;
import SQL.model.Order;
import SQL.model.Order_item;
import SQL.model.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class View extends JFrame {
    private JComboBox<Customer> customerComboBox;
    private JComboBox<Product> productComboBox;
    private JTextField quantityField;
    private JTable orderItemsTable;
    private DefaultTableModel tableModel;
    private JButton addProductButton;
    private JButton createOrderButton;
    private JButton showOrderHistoryButton;
    private JLabel totalAmountLabel;

    public View() {
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.taoLuaChonCustomer();
        this.taoLuaChonProduct();
        quantityField = new JTextField(5);
        this.add(new JLabel("Quantity:"));
        this.add(quantityField);
        String[] columnNames = {"Product Name", "Quantity", "Price", "Total"};
        tableModel = new DefaultTableModel(columnNames, 0);
        orderItemsTable = new JTable(tableModel);
        this.add(new JScrollPane(orderItemsTable));
        addProductButton = new JButton("Add Product");
        createOrderButton = new JButton("Create Order");
        showOrderHistoryButton = new JButton("Show Order History");
        totalAmountLabel = new JLabel("Total Amount: $0.00");
        ActionListener ac = new ViewHandler(this);
        addProductButton.addActionListener(ac);
        createOrderButton.addActionListener(ac);
        showOrderHistoryButton.addActionListener(ac);
        this.add(addProductButton);
        this.add(createOrderButton);
        this.add(showOrderHistoryButton);
        this.add(totalAmountLabel);
        this.setSize(600, 600);
    }

    public void addProductToOrder() {
        Product product = (Product) productComboBox.getSelectedItem();
        int quantity = Integer.parseInt(quantityField.getText());
        double total = product.getProduct_price()* quantity;
        tableModel.addRow(new Object[]{product.getProduct_name(), quantity, product.getProduct_price(), total});
        showtinhTong();
    }

    public void taoOrder() {
        Customer customer = (Customer) customerComboBox.getSelectedItem();

        Order order = new Order();
        order.setCustomer(customer);
        order.setOrder_date(new java.util.Date(System.currentTimeMillis()));
        OrderDAO.getInstance().insert(order);
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String productName = (String) tableModel.getValueAt(i, 0);
            int quantity = (int) tableModel.getValueAt(i, 1);
            Product productA = (Product) productComboBox.getSelectedItem();
            productA.setProduct_name(productName);
            Product product = ProductDAO.getInstance().selectById(productA);

            Order_item orderItem = new Order_item();
            orderItem.setOrder(order);
            orderItem.setProduct(product);
            orderItem.setQuantity(quantity);
            OrderDAO.getInstance().insertItem(orderItem);
        }
        JOptionPane.showMessageDialog(this, "Thanh cong");
    }

    public void showLichSu() {
        Customer customer = (Customer) customerComboBox.getSelectedItem();
        List<Order> orders = OrderDAO.getInstance().getOrdersByCustomerId(customer.getCustomer_id());

        if (orders == null || orders.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khach nay chua co don nao");
            return;
        }

        StringBuilder orderHistory = new StringBuilder();
        for (Order order : orders) {
            orderHistory.append("Order ID: ").append(order.getOrder_id()).append("\n");
            orderHistory.append("Order Date: ").append(order.getOrder_date()).append("\n");

            for (Order_item item : order.getOrder_items()) {
                orderHistory.append("- ").append(item.getProduct().getProduct_name())
                        .append(" x").append(item.getQuantity()).append("\n");
            }

            orderHistory.append("\n");
        }

        JOptionPane.showMessageDialog(this, orderHistory.toString());
    }


    private void showtinhTong() {
        double totalAmount = 0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            totalAmount += (double) tableModel.getValueAt(i, 3);
        }
        totalAmountLabel.setText("Total Amount: $" + totalAmount);
    }

    public void taoLuaChonCustomer(){
        List<Customer> customers = CustomerDAO.getInstance().selectAll();
        customerComboBox = new JComboBox<>(customers.toArray(new Customer[0]));
        this.add(new JLabel("Select Customer:"));
        this.add(customerComboBox);
    }
    public void taoLuaChonProduct(){
        List<Product> products = ProductDAO.getInstance().selectAll();
        productComboBox = new JComboBox<>(products.toArray(new Product[0]));
        this.add(new JLabel("Select Product:"));
        this.add(productComboBox);
    }
}
