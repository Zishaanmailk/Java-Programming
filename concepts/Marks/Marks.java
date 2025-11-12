import java.util.*;
//Kirlosk
class Marks{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your marks in English:\t");
        int eng=sc.nextInt();
        System.out.println("Enter your marks in Chemistry:\t");
        int chem=sc.nextInt();
        System.out.println("Enter your marks in Physics:\t");
        int phy=sc.nextInt();

        int total=chem+eng+phy;
        int a=(chem+eng+phy)/3;

        System.out.println("Your Total Marks are: "+total);
        System.out.println("Your total average is: "+a);

    }
}