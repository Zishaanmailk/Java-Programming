import  java.util.*;

class Positive{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("The number is Positive.");
        }
        else{
            System.out.println("The number is Negative.");
        }
    }

}