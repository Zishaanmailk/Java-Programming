import java.util.*;
class grater {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
             System.out.println("A is grater than B");
        }
        else{
             System.out.println("B is grater than A");
        }
    }
    
}
