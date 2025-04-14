package bai1.bai1_6;

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2);

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        // Test transfer()
        a1.transfer(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
