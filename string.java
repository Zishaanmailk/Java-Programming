import java.util.*;
public class string {
    public static void main(string[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string 1 ");
        String a=sc.nextLine();
        System.out.println("enter a string 2 ");
        String b=sc.nextLine();
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.equals(b))
        {
            System.out.println("the strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        sc.close();
    }
}
