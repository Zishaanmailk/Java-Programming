
import java.util.*;

class Greet{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: \t");
        String name=sc.nextLine();
        System.out.println("Enter your age: \t");
        int age=sc.nextInt();

        System.out.println("Hello "+name+"!Your age is "+age+".");
    }

}


