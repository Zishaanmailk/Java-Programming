//Kirlosk
import java.util.*;

class Array_1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("Enter five numbers: ");
        for(int i=0;i<5;i++){
            n[i]=sc.nextInt();
        }

        System.out.println("Our Array has following numbers: ");
        for(int i=0;i<5;i++){
            System.out.println(n[i]);
        }
    }
}