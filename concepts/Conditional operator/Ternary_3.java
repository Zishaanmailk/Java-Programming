import java.util.*;

class Ternary_3{
    public static void main(String []args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String Result=(num>0)?"Positive":(num<0)?"Negative":"Zero";
        System.out.println("The number is: "+Result);
    }
}