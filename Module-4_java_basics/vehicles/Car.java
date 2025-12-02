package vehicles;

public class Car implements Vehicle {
    private int topSpeed;

    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public int speed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "Car[topSpeed=" + topSpeed + "]";
    }
}
