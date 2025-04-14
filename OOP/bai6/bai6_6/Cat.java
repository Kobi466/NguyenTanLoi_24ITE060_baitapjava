package bai6.bai6_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("meo meo");
    }
}

