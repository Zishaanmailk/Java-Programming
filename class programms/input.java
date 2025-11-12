import java.util.*;
class input {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        System.out.println("Addition is "+c);
        System.out.println("Subb is "+d);
        System.out.println("mul is "+e);
    }
}