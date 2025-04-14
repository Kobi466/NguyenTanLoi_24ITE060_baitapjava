package bai1.bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance = balance + amount;
    }
    public int debit(int amount) {
        if(amount <= balance) {
            System.out.println("Amount exceeded balance");
            return balance = balance - amount;
        }
        if(amount > balance) {
            System.out.println("Tai khoan khong du tien");
        }
        return balance;
    }

    public int transfer(Account another, int amount) {
        if(amount <= this.getBalance()) {
            System.out.println("Amount exceeded balance");
            another.credit(amount);
            return balance = this.debit(amount);
        }
        return balance;
    }

    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
