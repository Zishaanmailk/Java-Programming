import java.util.*;
public class Greater {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two no");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
             System.out.println("A is greater");
        }
        else if(b>a)
        {
             System.out.println("B is greater");
        }
        else
        System.out.println("both are equal");
    }
}
