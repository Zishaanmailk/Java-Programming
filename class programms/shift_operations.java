import java.util.Scanner;

public class shift_operations {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        System.out.print("Enter number for left shift: ");
        int n = aa.nextInt();
        int result,result2,result3,result4;
        result = Lshift(a,n);
        result2 = Rshift(a,n);
        result3= Rshift_unsign(a,n);
        result4= Lshift_unsign(a,n);
        System.out.println("a << "+result);
        System.out.println("a >> "+result2);
        System.out.println("a <<< "+result4);
        System.out.println("a >>> "+result3);
    }
    public static int Lshift(int a,int n) {
        int result = a<<n;
        return result;
    }
    public static int Rshift(int a,int n) {
        int result = a>>n;
        return result;
    }
    public static int Rshift_unsign(int a,int n) {
        int result = a>>>n;
        return result;
    }
    public static int Lshift_unsign(int a,int n) {
        int result = a<<n;
        return result;
    }

}
