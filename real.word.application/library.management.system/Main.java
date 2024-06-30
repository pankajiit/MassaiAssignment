public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book(3, "1984", "George Orwell");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayBooks();

        // Remove a book from the library
        library.removeBook(2);

        // Display all books again
        library.displayBooks();
    }
}
