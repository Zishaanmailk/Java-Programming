//Kirlosk
import java.util.*;

class Linear{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements fo a array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the element you want to find: ");
        int find=sc.nextInt();

        boolean success=false;


        for(int i=0;i<n;i++){
            if(find==arr[i]){
                System.out.println("The element is present at index: "+i);
                success =true; 
            }
        }
        if(!success){
            System.out.println("Element not found!");
        }
    }
}