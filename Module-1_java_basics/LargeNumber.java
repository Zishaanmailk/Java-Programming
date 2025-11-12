import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.err.println("Enter the second number");
        int b = sc.nextInt();
        System.out.print("Enter the third number");
        int c = sc.nextInt();
        if(a >= b && a >= c) {
            System.out.println("Largest number is First" + a);
        } else if (b >= a && b >= c) {
            System.err.println("Largest number is Second " +b);
        } else {
             System.err.println("Largest number is Third " +c);
        }      
        sc.close();
    }
}
