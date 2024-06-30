import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getBookName() + " added to the library.");
    }

    // Remove a book from the library by bookId
    public void removeBook(int bookId) {
        boolean removed = books.removeIf(book -> book.getBookId() == bookId);
        if (removed) {
            System.out.println("Book with ID " + bookId + " removed from the library.");
        } else {
            System.out.println("Book with ID " + bookId + " not found in the library.");
        }
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
