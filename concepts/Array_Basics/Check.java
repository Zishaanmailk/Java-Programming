import java.util.*;

class Check{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]={23,45,67,89,23,43,12,45,87,34,90,43};
        System.out.println("Enter the element you want to find: ");
        int check=sc.nextInt();
        boolean found=false;
        for(int i=0;i<12;i++){
            if(arr[i]==check){
                System.out.println("Element "+arr[i]+" found at index "+i+".");
                found =true;
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }
    }
}
