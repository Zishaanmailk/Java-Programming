import java.util.Scanner;
public class Data {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your name");
            String name=sc.nextLine();
            System.out.println("hello "+name);
            System.out.println("enter age");
            int age=sc.nextInt();
            System.out.println("age is "+age);
            sc.close();
        }
    }

}
