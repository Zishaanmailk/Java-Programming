import java.util.*;

class Array_even{
    public static void main(String []args){
        int arr[]={23,45,67,89,23,43,12,45,87,34,90,43};
        System.out.println("Even numbers present in the array are: ");
        for(int i=0;i<12;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
