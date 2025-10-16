public class overload {
    String title;
    String author;
    double price;


    public overload(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

 
    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("");
    }

 
    void showDetails(String title) {
        System.out.println("Book Title: " + title);
        System.out.println("------------------------");
    }

   
    void showDetails(String title, String author) {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("------------------------");
    }

   
    public static void main(String[] args) {
        overload book1 = new overload("The Alchemist", "Paulo Coelho", 499.99);
        overload book2 = new overload("1984", "George Orwell", 299.50);


        book1.showDetails(); 
        book1.showDetails("The Alchemist"); 
        book2.showDetails("1984", "George Orwell"); 
    }
}


