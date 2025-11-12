import java.util.*;

class even{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: \t");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("It is an even number.\n");
        }
        else{
            System.out.println("It is an odd number.\n");
        }

    }
}