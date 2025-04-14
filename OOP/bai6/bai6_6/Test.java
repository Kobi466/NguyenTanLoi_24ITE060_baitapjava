package bai6.bai6_6;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Cho");
        System.out.println();
        c.greets();
        Dog d = new Dog("Meo");
        Dog d1 = new Dog("Mia");
        d.greets();
        d.greets(d1);//con cho khac goi con khac
        BigDog bd = new BigDog("bigbull");
        BigDog bd1 = new BigDog("pig");
        bd.greets();
        bd.greets(d1);
        bd.greets(bd1);
    }
}
