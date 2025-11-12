import java.util.*;

class Ternary_2{
    public static void main(String []args){
        System.out.println("Enter the marks: ");
        Scanner sc=new Scanner(System.in);
        int marks =sc.nextInt();

        String grade=(marks>=90)?"A":(marks>=75)?"B":(marks>=50)?"C":"F";
        System.out.println("Grade: "+grade);

    }
}