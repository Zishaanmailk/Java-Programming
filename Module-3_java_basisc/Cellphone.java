public class Cellphone {
    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void call() {
        System.out.println("Calling...");
    }

    public static void main(String[] args) {
        Cellphone c = new Cellphone();

        c.ring();
        c.vibrate();
        c.call();
    }
}
