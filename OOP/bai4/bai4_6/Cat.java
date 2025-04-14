package bai4.bai4_6;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }
    public String toString(){
        return "Cat["+super.toString()+"]";
    }
    public void greets(){
        System.out.println("Moew");
    }
}
