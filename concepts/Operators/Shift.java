
public class Shift{
    public static void main(String []args){

        System.out.println("Left shift operator -->");
        int a =5;
        int result=a<<2;
        System.out.println("a << 2= "+result);

        System.out.println(" ");
        System.out.println("-------------");
        System.out.println(" ");
        System.out.println("Right shift operator -->");

        int b =20;
        int result_2=b>>2;
        System.out.println("b >> 2= "+result_2);

        System.out.println(" ");
        System.out.println("-------------");
        System.out.println(" ");

        System.out.println("Unsigned Right Shift---> ");
        int c =-20;
        int result_3=c>>>2;
        System.out.println("c>>>2 = "+result_3);



    }
}