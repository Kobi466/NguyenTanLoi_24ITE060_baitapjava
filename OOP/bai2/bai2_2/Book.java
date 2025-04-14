package bai2.bai2_2;

import java.util.ArrayList;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthor(Author[] author) {
        this.authors = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder();
        for (Author author : authors) {
            authorDetails.append(author.toString()).append(",");
        }
        if (authorDetails.length() > 0) {
            authorDetails.deleteCharAt(authorDetails.length() - 1); // Xóa dấu phẩy cuối cùng
        }
        return "Book[name=" + name + ", authors={" + authorDetails.toString() + "}, price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        if (authorNames.length() > 0) {
            authorNames.delete(authorNames.length() - 2, authorNames.length()); // Xóa ", " cuối cùng
        }
        return authorNames.toString();
    }
}
