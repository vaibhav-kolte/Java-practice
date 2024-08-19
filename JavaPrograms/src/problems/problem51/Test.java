package problems.problem51;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to my library.");

        System.out.println("Total number of books in library is " + Book.getTotalBooks());

        Book book1 = new Book("Book1", "Book1 author", "1234");
        Book book2 = new Book("Reach dad poor dad","Book2 author","123456");
        System.out.println("Total number of books in library is " + Book.getTotalBooks());

        book1.borrowBook();
        book1.borrowBook();

        book1.returnBook();
        book1.returnBook();

    }
}
