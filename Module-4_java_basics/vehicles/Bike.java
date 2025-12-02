package vehicles;

public class Bike implements Vehicle {
    private int maxSpeed;

    public Bike(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int speed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Bike[maxSpeed=" + maxSpeed + "]";
    }
}
