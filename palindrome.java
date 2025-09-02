import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("enter string: ");
        str = scan.nextLine();
        System.out.print("reversed strng: "+palincheck(str));
    }
    static String palincheck(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            rev.append(c);
        }
        String rev1=rev.toString();
        String result;
        if(str.toLowerCase().equals(rev1.toLowerCase())){
            result="palindrome";
        }
        else{
            result="not palindrome";
        }
        return result;
    }
}

