public class Car {
    String make;
    String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");
        System.out.println("Runtime class: " + c.getClass());
    }
}
