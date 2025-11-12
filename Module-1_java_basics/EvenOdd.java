import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.err.println("The given number is Even");            
            } else {
                System.err.println("'The given number is Odd");
            }
        }
    }
}
