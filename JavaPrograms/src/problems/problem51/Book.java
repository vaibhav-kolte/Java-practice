package problems.problem51;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isBookInLibrary;
    public static int totalBooks;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
        isBookInLibrary = true;
    }

    public void borrowBook() {
        if (isBookInLibrary) {
            System.out.println("Enjoy the book.");
            isBookInLibrary = false;
        } else {
            System.out.println("Book is already borrow someone.");
        }
    }

    public void returnBook() {
        if (!isBookInLibrary) {
            System.out.println("Leave feedback");
            isBookInLibrary = true;
        } else {
            System.out.println("Book is already in the library.");
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}
