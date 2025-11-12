import java.util.*;
public class Statements {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int lim = sc.nextInt();

        for(int i=0;i<=lim;i++){
            if(i%5==0){
                continue;
            }
            if(i==51){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
