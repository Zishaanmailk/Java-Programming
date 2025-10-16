import java.util.*;
public class equalstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String a=sc.nextLine();
        System.out.println("enter string 2");
        String b=sc.nextLine();
        b=b.toUpperCase();
        a=a.toUpperCase();
        if(a.equals(b))
        {
            System.out.println("are equal");
        }
        else
        {
             System.out.println("are not equal");
        }
    }
}
