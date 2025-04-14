package bai7.bai7_1;

import bai1.bai1_7.Date;
import bai1.bai1_7.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println(DiscountRate.getServiceDiscountRate("Gold"));
        Customer customer = new Customer("Alice");
        customer.setMember(true);
        customer.setMemberType("Gold");

        Visit visit = new Visit(customer.getName(), new java.util.Date(2025 - 1900, 06 - 1, 04));
        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        DiscountRate discountRate = new DiscountRate();
        double serviceDiscount = discountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = discountRate.getProductDiscountRate(customer.getMemberType());

        System.out.println("Customer Info: " + customer);
        System.out.println("Visit Info: " + visit);
        System.out.println("Service Discount: " + serviceDiscount);
        System.out.println("Product Discount: " + productDiscount);
    }
}

