import java.util.*;

class Factorial {
    static int fact(int f) {
        if (f == 0 || f == 1) {
            System.out.println("Fact of 1 or 0 is 1.");
            return 1;
        } 
        else {
            return f * fact(f - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int f = sc.nextInt();
        int result = fact(f);
        System.out.println("Factorial is: " + result);
    }
}
