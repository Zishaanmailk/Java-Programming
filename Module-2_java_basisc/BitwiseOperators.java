import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));

        System.out.println("Binary of a: " + Integer.toBinaryString(a));
        System.out.println("Binary of b: " + Integer.toBinaryString(b));
    }
}

