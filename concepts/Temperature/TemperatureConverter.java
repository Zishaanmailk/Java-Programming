//Kirlosk
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double temp;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp = scanner.nextDouble();
                System.out.println("Fahrenheit: " + (temp * 9/5 + 32));
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = scanner.nextDouble();
                System.out.println("Celsius: " + ((temp - 32) * 5/9));
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                temp = scanner.nextDouble();
                System.out.println("Kelvin: " + (temp + 273.15));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
