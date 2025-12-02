public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1001, "Alice");
        Student s2 = new Student(1001, "Bob");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.hashCode() == s2.hashCode(): " + (s1.hashCode() == s2.hashCode()));
    }
}
