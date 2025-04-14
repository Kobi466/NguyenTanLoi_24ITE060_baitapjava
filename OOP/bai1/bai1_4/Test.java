package bai1.bai1_4;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(22, "Loi", "Tan", 25000);
        System.out.println(e1);
        System.out.println(e1.getAnnuaSalary());
        System.out.println(e1.raiseSalary(30));

        e1.setSalary(50);
        System.out.println(e1);
        System.out.println(e1.getAnnuaSalary());
        System.out.println(e1.raiseSalary(30));
    }
}
