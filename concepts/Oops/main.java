import java.util.Scanner;

class Student {
    String Name;
    int Roll;
    String Dept;
    char Section;
    int DOB;
    int Age;
    
    // Constructor
    Student(String name, int roll, String dept, int dob, int age, char sec) {
        this.Name = name;
        this.Roll = roll;
        this.Dept = dept;
        this.DOB = dob;
        this.Section = sec;
        this.Age = age;
    }
    
    // Display method - corrected to use instance variables
    void display() {
        System.out.println("Name: " + this.Name + 
                         "\nRoll Number: " + this.Roll + 
                         "\nDepartment: " + this.Dept + 
                         "\nSection: " + this.Section + 
                         "\nDate of Birth: " + this.DOB + 
                         "\nAge: " + this.Age);
    }
    
    // Finalize method - simplified for beginner level
    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        System.out.println("[finalize()] Student object is being cleaned up: " + this.Name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter student details:");
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        
        System.out.print("Enter Date of Birth (YYYYMMDD): ");
        int dob = sc.nextInt();
        
        System.out.print("Enter Section: ");
        char sec = sc.next().charAt(0);  // Fixed: no nextChar() method exists
        
        sc.nextLine(); // Consume the remaining newline
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        
        // Create Student object with correct parameter order and new keyword
        Student student = new Student(name, roll, dept, dob, age, sec);
        
        // Display student information
        student.display();
        
        sc.close();
    }
}
