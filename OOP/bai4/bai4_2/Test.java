package bai4.bai4_2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Alice", "123 Main St", "Computer Science", 2024, 12000.0);
        System.out.println(student);
        student.getInfor();

        Staff staff = new Staff("Bob", "456 Oak St", "XYZ School", 3500.0);
        System.out.println(staff);
        System.out.println(staff.getPay());
        staff.getInfor();
        staff.setPay(2230.0);
        System.out.println(staff.getPay());

        Person p = new Person("Alice", "123 Main St");
        System.out.println(p);
    }

}


