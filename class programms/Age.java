import java.util.Scanner;
public class Age {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age<=18)
            System.out.println("you are a child");
        else if(age>18 && age<65)
            System.out.println("you are an adult");
        else if (age>65)
            System.out.println("you an old man");
        else if(age==0)
            System.out.println("you are a baby");
        else 
            System.out.println("nice try");
        sc.close();
    }

}
