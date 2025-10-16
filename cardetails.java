class car {
    String model;
    int year;
    double price;
    String type;

    car (String model, int year, double price, String type) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.type = type;
    }
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Type: " + type);
    }
}

public class cardetails {
    public static void main(String[] args) {
        car myCar = new car("Toyota Camry", 2020, 24000.00, "Sedan");
        myCar.displayDetails();
    }
}