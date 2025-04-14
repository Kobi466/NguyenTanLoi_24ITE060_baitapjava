package bai2.bai2_5;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer(22, "Kobi", 'm');
        Account account = new Account(11, c1, 9.99);
        System.out.println(account);
        account.deposit(10);
        System.out.println(account);
        account.withdraw(5);
        System.out.println(account);
    }
}
