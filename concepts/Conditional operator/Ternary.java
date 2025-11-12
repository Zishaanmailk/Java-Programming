import java.util.Scanner;
class Ternary{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();

        String result = (number%2==0)?"Even":"Odd";
        System.out.println("The number is: "+result);
    }
}