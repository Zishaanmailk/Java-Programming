//Kirlosk

import java.util.*;

class area{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("Enter the radius of the circle(in cm): ");
        double r=sc.nextDouble();
        double area=(pi*r*r);
        System.out.println("Area of circle with radius "+r+"cm is "+area+" sqcm.");

    }
}