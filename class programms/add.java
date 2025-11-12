import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.println("Enter number: "); 

        Scanner aa =new Scanner(System.in);
        Scanner bb =new Scanner(System.in);
        int a=aa.nextInt();
        int b=bb.nextInt();
        int sum=add(a,b);
        System.out.println("sum is " +sum);
    }
    public static int add(int a,int b){
        
        int sum = a+b;

        return sum;
    }
}