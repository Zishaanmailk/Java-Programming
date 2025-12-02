public class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + ((int) price) + "]";
    }

    public static void main(String[] args) {
        Book book = new Book("Java", 500);
        System.out.println(book); 
    }
}
