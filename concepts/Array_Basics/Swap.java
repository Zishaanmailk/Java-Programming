//Kirlosk
import java.util.*;

class Swap{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int swap[]=new int[size];

        System.out.println("Original array: "+Arrays.toString(arr));
        int temp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=temp;
        System.out.println("After swapping: "+Arrays.toString(arr));

    }

}