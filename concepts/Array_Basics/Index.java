//Finding the index of the element
import java.util.*;

class Index{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number: ");
        int target=sc.nextInt();
        int index=0;

        for(int i=0;i<size;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }

        System.out.println("The number is present in the array at "+index+" index.");

    }
}