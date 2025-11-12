import java.util.*;

class Boolean{
    public static void main(String []args){
        int age=25;
        boolean hasLicense=true;

        if(age>18 && hasLicense){
            System.out.println("Eligible to Drive.");
        }
        else{
            System.out.println("Is not eligible to drive.");
        }
    }
}