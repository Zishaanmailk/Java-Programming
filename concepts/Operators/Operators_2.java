import java.util.*;

class Operators_2{
    public static void main(String []args){
        int x=5;
        int y=9;
        System.out.println("Is x<y: "+(x<y));

        System.out.println("--------------");
        System.out.println("Is  x>y: "+(x>y));
        System.out.println("--------------");
        System.out.println("Logical not--->");

        boolean isRaining=false;

        if(!isRaining){
            System.out.println("You can go outside without an umbrella.");
        }
        else{
            System.out.println("Take an Umbrella");
        }


    }
}