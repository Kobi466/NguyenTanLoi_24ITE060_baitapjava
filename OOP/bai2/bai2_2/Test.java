package bai2.bai2_2;

public class Test {
    public static void main(String[] args) {
        Author[] author = new Author[2];
        author[0] = new Author("John", "john@gmail.com", 'M');
        author[1] = new Author("Jane", "jane@gmail.com", 'F');
        System.out.println(author[0]);
        System.out.println(author[1]);

        Book b1 = new Book("One Piece", author, 19.99, 99);
        System.out.println(b1);
    }
}