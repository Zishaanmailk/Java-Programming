//Kirlosk
import java.util.*;

class Reverse{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array: "+(Arrays.toString(arr)));
        int reverse[]=new int[size];
        for(int i=0;i<size;i++){
            reverse[i]=arr[size-1-i];
        }
        System.out.println("Reverse array: "+(Arrays.toString(reverse)));
    }
}