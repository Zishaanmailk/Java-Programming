import java.util.*;

class Min{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min=0;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element present in the array is: "+min);

    }
}

