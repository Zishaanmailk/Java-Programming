import java.util.Scanner;
class Student {
    String name;
    int rollno;
    void setdata(String n, int r){
        name = n;
        rollno = r;
    }
    void display() {
        System.out.println("Name :"+name + "Rollno :"+rollno);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name :");
        String name = sc.nextLine();
        System.err.println("Enter the student rollno :");
        int rollno = sc.nextInt();
        Student s1 = new Student(); 
        s1.setdata(name , rollno);
        s1.display();
    }
}
