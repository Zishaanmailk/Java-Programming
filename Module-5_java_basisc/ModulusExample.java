import java.util.Scanner;
//rohit
public class ModulusExample {
    public static void main(String[] args) {
        int a, b;
        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integers (a b):");
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
        }

        try {
            int res = a % b;
            System.out.println(a + " % " + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: cannot modulus by zero");
        }
    }
}
