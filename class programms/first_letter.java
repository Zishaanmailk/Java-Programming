import java.util.Scanner;
public class first_letter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("enter string: ");
        str = scan.nextLine();
        System.out.print("first latter is: "+str.charAt(0));
    }
}
