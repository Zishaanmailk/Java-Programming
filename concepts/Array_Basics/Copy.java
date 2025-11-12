import java.util.*;

class Copy{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter upto 6 elements of the array: ");
        int arr[]=new int[6];
        int copy[]=new int[6];

        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array 1: "+(Arrays.toString(arr)));
        System.out.println("Array 2: "+(Arrays.toString(copy)));
        System.out.println("After copying the array...");
        for(int i=0;i<6;i++){
            copy[i]=arr[i];
        }
        System.out.println("Array 1: "+(Arrays.toString(arr)));
        System.out.println("Array 2: "+(Arrays.toString(copy)));
        System.out.println("Array 1 copied successfully to Array 2!");



    }

}
