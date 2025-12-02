interface Bank {
    int rateOfInterest();
}

class SBI implements Bank {
    public int rateOfInterest() { return 5; }
}

class HDFC implements Bank {
    public int rateOfInterest() { return 7; }
}

public class BankExample {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest: " + b.rateOfInterest());

        b = new HDFC();
        System.out.println("HDFC Interest: " + b.rateOfInterest());
    }
}
