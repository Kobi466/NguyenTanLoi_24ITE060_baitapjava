package bai2.bai2_1;

public class Test {
    public static void main(String[] args) {
        Author author = new Author("Kobi", "loint.24ite@vku.udn.vn", 'm');
        System.out.println(author);
        Book book = new Book("One Piece", author, 30.40, 30000);
        System.out.println(book);
        author.setEmail("kobi@vku.udn.vn");
        System.out.println(book);

        System.out.println("------------------------");

        Book book2 = new Book("Naruto", new Author("Loi", "loikobi123@gmail.com", 'm'), 30.40, 30000);
        System.out.println(book2);
        book2.setAuthor(author);
        System.out.println(book2);
        book2.getAuthor().setEmail("tanloi@vku.udn.vn");
        System.out.println(book2.getAuthor());
        System.out.println(book2.getAuthor().getEmail());
        System.out.println(book2);
    }
}