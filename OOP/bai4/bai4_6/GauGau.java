package bai4.bai4_6;

public class GauGau {
    public static void main(String[] args) {
        Animal animal = new Mammal("Lion");
        System.out.println(animal);
        Animal animal1 = new Animal("Conca");
        System.out.println(animal1);

        Cat cat = new Cat("Tran duc bo");
        System.out.println(cat);
        cat.greets();

        Dog dg = new Dog("Kobi");
        System.out.println(dg);
        dg.greets();
        Dog dg1 = new Dog("Loi");
        System.out.println(dg1);
        dg1.greets(dg);
    }
}
