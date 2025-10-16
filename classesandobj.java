class Student {
    int id;
    int sem;
    int year;
    String name;

    Student(int id, int sem, int year, String name) {
        this.id = id;
        this.sem = sem;
        this.year = year;
        this.name = name;
    }

    void display() {
        System.out.println("id = " + id);
        System.out.println("sem = " + sem);
        System.out.println("year = " + year);
        System.out.println("name = " + name);
    }
}

public class classesandobj {
    public static void main(String[] args) {
        Student s = new Student(1, 3, 2, "zishaan");
        s.display();
    }
}