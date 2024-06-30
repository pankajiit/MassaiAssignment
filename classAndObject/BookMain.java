public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", 1000);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2000);

        book1.getDetails();
        book2.getDetails();

    }
    
}
