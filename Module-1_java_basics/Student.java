public class Student {
    String name;
    int age;
    String course;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rohit";
        s.age = 20;
        s.course = "B.Tech CSE";

        s.display();
    }
}
