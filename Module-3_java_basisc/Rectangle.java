public class Rectangle {
    int length;
    int breadth;

   
    Rectangle() {
        length = 4;
        breadth = 5;
    }

  
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();          
        Rectangle r2 = new Rectangle(10, 20);     

        System.out.println("Default Rectangle Area: " + r1.area());
        System.out.println("Custom Rectangle Area: " + r2.area());
    }
}
