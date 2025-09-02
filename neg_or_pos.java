import java.util.Scanner;
public class neg_or_pos {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=a.nextInt();
        String result= np( n);
        System.out.print(result);
    }
    static String np(int n){
        if(n>0){
            return("your number is +ve");
        }
        else if(n<0){
            return("your number is -ve");
        }
        else{
            return("your number is 0");
        }
    }
}
