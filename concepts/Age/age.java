import java.util.*;

class age{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Birthyear: ");
        int birthyear=sc.nextInt();
        int age=(2025-birthyear);
        System.out.println("Your age is "+age+".");
    }
}