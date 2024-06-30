public class Book {
    private String title;
    private String author;
    private float price;
    
    
    public Book(String title, String author, float price){
        this.title = title;  
        this.author = author;
        this.price = price;
    }

    public void getDetails(){
        String details = "title : " + this.title + "\n" + 
               "Author : " + this.author + "\n" + 
               "price : " + this.price + "\n";
        System.out.println(details);       

    }
}
