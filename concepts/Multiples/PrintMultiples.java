
import java.util.Scanner;

public class PrintMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.print("Enter the number to find multiples of: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " from 0 to " + upperLimit + ":");
        for (int i = 0; i <= upperLimit; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
