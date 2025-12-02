public class Transport {
    void move() {
        System.out.println("Transport is moving");
    }

    public static void main(String[] args) {
        Bus b = new Bus();
        Truck t = new Truck();

        b.move();
        b.carryPassengers();

        t.move();
        t.carryGoods();
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods");
    }
}
