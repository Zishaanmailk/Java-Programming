import java.util.*;
public class greater50 {
    public static void main(String[]args)
    {
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>50)
            {
                count++;
            }
        }
        System.out.println("the no of elements above 50: " +count);
        sc.close();
    }
}
