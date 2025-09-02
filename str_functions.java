import java.util.Scanner;
public class str_functions {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String str ;
        System.out.print("enter string: ");
        str=scan.nextLine();
        System.out.println("lower case: "+str.toLowerCase());
        System.out.println("upper case: "+str.toUpperCase());
        System.out.println("lenth: "+str.length());
        int i;
        for( i=0;i<str.length();i++)
            System.out.print(" "+str.charAt(i));
    }
}
