import java.util.Scanner;

public class opprations {
    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner aa =new Scanner(System.in);
        int a=aa.nextInt();
        System.out.println("orignal 0f a: "+a);
        System.out.println("post increament 0f a: "+(a++));
        System.out.println("pree increament 0f a: "+(++a));
        System.out.println("post decreament 0f a: "+(a--));
        System.out.println("pree decreament 0f a: "+(--a));
    }
}
