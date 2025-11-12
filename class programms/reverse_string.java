import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("enter string: ");
        str = scan.nextLine();
        System.out.print("reversed strng: "+reverse(str));
    }
    static String reverse(String str){
        StringBuilder rev=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            rev.append(c);
        }
        return(rev.toString());
    }
}
