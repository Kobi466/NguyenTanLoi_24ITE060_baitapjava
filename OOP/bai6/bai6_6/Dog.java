package bai6.bai6_6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("ang ang ang");
    }

    public void greets(Dog another){
        System.out.println("ang ang ang ang ang ang");
    }
}

