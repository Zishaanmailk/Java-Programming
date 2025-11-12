import java.util.*;
//Kirlosk
class Greater_Numbers{
    public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:\t");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("The greater number is: "+ a);
        }
        else if(a==b){
            System.out.println("Both the numbers are equal. ");
        }
        else{
            System.out.println("The greater number is: "+ b);
        }
    }
}
