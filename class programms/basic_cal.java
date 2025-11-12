import java.util.*;

public class basic_cal {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = a.next().charAt(0);

        float result = calc(ch);
        System.out.println("Result: " + result);
    }

    public static float add() {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float x = b.nextFloat();
        System.out.print("Enter number 2: ");
        float y = b.nextFloat();
        return x + y;
    }

    public static float sub() {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float x = b.nextFloat();
        System.out.print("Enter number 2: ");
        float y = b.nextFloat();
        return x - y;
    }

    public static float mul() {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float x = b.nextFloat();
        System.out.print("Enter number 2: ");
        float y = b.nextFloat();
        return x * y;
    }

    public static float div() {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float x = b.nextFloat();
        System.out.print("Enter number 2: ");
        float y = b.nextFloat();
        if (y == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return x / y;
    }

    public static float calc(char ch) {
        float result = 0;
        switch (ch) {
            case '+': result = add(); break;
            case '-': result = sub(); break;
            case '*': result = mul(); break;
            case '/': result = div(); break;
            default: System.out.println("Wrong input"); break;
        }
        return result;
    }
}
