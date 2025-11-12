//Kirlosk
import java.util.*;

class Array_2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        

        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        float average = (sum/n);

        System.out.println("The sum of the array is: "+sum);
        System.out.println("Average of the given array is: "+average);


    }
}