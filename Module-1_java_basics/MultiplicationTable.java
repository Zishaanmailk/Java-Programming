import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}

