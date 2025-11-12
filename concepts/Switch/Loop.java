import java.util.*;

public class Loop {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number =sc.nextInt();

        int sum =0;
        while(number > 0){
            int digit =number%10;
            sum += digit;
            number =number /10;
        }

        System.out.println("Sum of digits: "+sum);
    }
}
