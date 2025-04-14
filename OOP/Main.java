
class NgoaiLe extends Exception {
    NgoaiLe (String message) {
        super(message);
    }
    NgoaiLe (Throwable cause) {
        super(cause);
    }
    NgoaiLe (String message, Throwable cause) {
        super(message, cause);
    }
}
class Student{
    String name;
    static int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    static void validateAge(int age) throws Exception {
//        if (age<0 ) {
//            throw new Exception ("Age must be greater than or equal to 0");
//        }
//    }
    static void validateAge(int age) throws NgoaiLe {
        if (age < 0) {
            throw new NgoaiLe("Age must be greater than or equal to 0");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student.validateAge(-1);
        System.out.println(Student.age=18);
    }
}
