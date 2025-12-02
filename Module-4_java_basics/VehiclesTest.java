import vehicles.Bike;
import vehicles.Car;
import vehicles.Vehicle;

public class VehiclesTest {
    public static void main(String[] args) {
        Vehicle bike = new Bike(90);
        Vehicle car = new Car(180);

        System.out.println(bike + " speed=" + bike.speed() + " km/h");
        System.out.println(car + " speed=" + car.speed() + " km/h");
    }
}
