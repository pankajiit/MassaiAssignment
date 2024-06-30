public class Book {
    private int bookId;
    private String bookName;
    private String author;

    public Book(int bookId, String bookName, String author){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public int getBookId() {
        return this.bookId;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + this.bookId + '\'' +
                ", bookName='" + this.bookName + '\'' +
                ", author='" + this.author + '\'' +
                '}';
    }
}
