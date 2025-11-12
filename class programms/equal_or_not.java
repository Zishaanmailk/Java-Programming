import java.util.Scanner;

public class equal_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        System.out.print("enter the strings1: ");
        str1 = scan.nextLine();
        System.out.print("enter the strings2: ");
        str2 = scan.nextLine();

        if (str1.toLowerCase().equals(str2.toLowerCase())){
            System.out.println(" are equal strings");
        }
        else{
            System.out.println(" are not equal strings");
        }

        if (str1==str2){
            System.out.println(" are same objects");
        }
        else {
            System.out.println(" are not same objects");
        }
    }

}
