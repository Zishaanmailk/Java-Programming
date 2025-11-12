import java.util.*;

class String_2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        if(s1.equals(s2)){
            System.err.println("Both the strings are equal!");
        }
        else{
            System.out.println("Both the strings are not equal.");
        }


    }
}
//Kirlosk