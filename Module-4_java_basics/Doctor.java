public class Doctor {
    void consultationFee() {
        System.out.println("General doctor fee: 300");
    }

    public static void main(String[] args) {
        Doctor d;

        d = new Dentist();
        d.consultationFee();

        d = new Cardiologist();
        d.consultationFee();

        d = new Surgeon();
        d.consultationFee();
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist fee: 500");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist fee: 1000");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon fee: 1500");
    }
}
