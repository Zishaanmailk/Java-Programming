import java.util.*;
class nested_if{
    public static void main(String []args){
        System.out.println("Enter your marks: ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=50){
            System.out.println("You passed the exam.");

            if(marks>=95){
                System.out.println("Grade O");
            }
            else if(marks>=90){
                System.out.println("Grade A+");
            }
            else if(marks>=75){
                System.out.println("Grade A");
            }
            else{
                System.out.println("Grade B");
            }
        }
        else{
            System.out.println("You failed in the exam.");
        }
    }
}