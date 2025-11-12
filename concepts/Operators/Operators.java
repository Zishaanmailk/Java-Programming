import java.util.*;

class Operators{
    public static void main(String []args){
        int x=10;

        System.out.println("Post increment and Pre increment-->");
        System.out.println("Orignal: "+x);
        System.out.println("Post Increment: "+(x++));
        System.out.println("After post increment: "+x);
        System.out.println("Pre-increment: "+(++x));
        System.out.println("Post-decrement: "+(x--));
        System.out.println("Pre decrement: "+(--x));

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");

        System.out.println("And operator-->");
        int a =12;
        System.out.println("a: "+a);
        int b=10;
        System.out.println("b: "+b);
        int result =a&b;
        System.out.println("a & b: "+ result);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");


        System.out.println("Or operator-->");
        int c =12;
        System.out.println("a: "+c);
        int d=10;
        System.out.println("b: "+d);
        int result_2 =a|b;
        System.out.println("a | b: "+ result_2);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");

        System.out.println("Xor operator-->");
        int e =12;
        System.out.println("a: "+e);
        int f=10;
        System.out.println("b: "+f);
        int result_3 =e^f;
        System.out.println("a ^ b: "+ result_3);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");

        System.out.println("Complement-->");
        int g =12;
        System.out.println("a: "+c);
        
        int result_4 =~a;
        System.out.println("~a: "+ result_4);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");


        
    }
}
