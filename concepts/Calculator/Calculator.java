<<<<<<< HEAD
import java.util.Scanner;

class Calculator{
    static void Add(int c,int d){
        System.out.println("Addition of the two numbers is "+(c+d));
    }
    static void Sub(int c,int d){
        System.out.println("Difference of the two numbers is "+(c-d));
    }
    static void Div(int c,int d){
        if(d==0){
            System.out.println("Zero Division error!");
        }
        else{
            System.out.println("Division of the two numbers are: "+(c/d));
        }
    }
    static void Mul(int c,int d){
        System.out.println("Multiplication of the two numbers is "+(c*d));
    }

    static void choice(int a,char op,int b){
        switch(op){
            case '+':Add(a,b);
                    break;
            case '-':Sub(a,b);
                    break;
            case '/':Div(a,b);
                    break;
            case '*':Mul(a,b);
                    break;
            default:
                System.out.println("Invalid operator!");
        }
    }
    static void start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the operator: ");
        char op=sc.next().charAt(0);
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        choice(a,op,b);
        end();
    }
    static void end(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 'C' to continue and 'Q' to quit.");
        char quit=sc.next().charAt(0);
        if(quit=='C'){
            start();
        }
        else if(quit=='Q'){
            System.out.println("Quitting...");
        }
        else{
            end();
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        start();  
    }
=======
<<<<<<< HEAD
import java.util.Scanner;

class Calculator{
    static void Add(int c,int d){
        System.out.println("Addition of the two numbers is "+(c+d));
    }
    static void Sub(int c,int d){
        System.out.println("Difference of the two numbers is "+(c-d));
    }
    static void Div(int c,int d){
        if(d==0){
            System.out.println("Zero Division error!");
        }
        else{
            System.out.println("Division of the two numbers are: "+(c/d));
        }
    }
    static void Mul(int c,int d){
        System.out.println("Multiplication of the two numbers is "+(c*d));
    }

    static void choice(int a,char op,int b){
        switch(op){
            case '+':Add(a,b);
                    break;
            case '-':Sub(a,b);
                    break;
            case '/':Div(a,b);
                    break;
            case '*':Mul(a,b);
                    break;
            default:
                System.out.println("Invalid operator!");
        }
    }
    static void start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the operator: ");
        char op=sc.next().charAt(0);
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        choice(a,op,b);
        end();
    }
    static void end(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 'C' to continue and 'Q' to quit.");
        char quit=sc.next().charAt(0);
        if(quit=='C'){
            start();
        }
        else if(quit=='Q'){
            System.out.println("Quitting...");
        }
        else{
            end();
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        start();  
    }
=======
import java.util.Scanner;

class Calculator{
    static void Add(int c,int d){
        System.out.println("Addition of the two numbers is "+(c+d));
    }
    static void Sub(int c,int d){
        System.out.println("Difference of the two numbers is "+(c-d));
    }
    static void Div(int c,int d){
        if(d==0){
            System.out.println("Zero Division error!");
        }
        else{
            System.out.println("Division of the two numbers are: "+(c/d));
        }
    }
    static void Mul(int c,int d){
        System.out.println("Multiplication of the two numbers is "+(c*d));
    }

    static void choice(int a,char op,int b){
        switch(op){
            case '+':Add(a,b);
                    break;
            case '-':Sub(a,b);
                    break;
            case '/':Div(a,b);
                    break;
            case '*':Mul(a,b);
                    break;
            default:
                System.out.println("Invalid operator!");
        }
    }
    static void start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the operator: ");
        char op=sc.next().charAt(0);
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        choice(a,op,b);
        end();
    }
    static void end(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 'C' to continue and 'Q' to quit.");
        char quit=sc.next().charAt(0);
        if(quit=='C'){
            start();
        }
        else if(quit=='Q'){
            System.out.println("Quitting...");
        }
        else{
            end();
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        start();  
    }
>>>>>>> 9f68986bfb87e9c67f9a9f10f25bf59ba7d0d43d
>>>>>>> 18603e86855f8b8e9e5a5cd550031d96b10ff430
}
//Kirlosk//
