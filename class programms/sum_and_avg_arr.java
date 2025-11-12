import java.util.Scanner;
public class sum_and_avg_arr {
    public static void main(String[]args)
    {
         int sum=0, avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements of arr");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("sum : "+sum+" avg : "+avg);
        sc.close();
    }
}