public class Employee {
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Employee e = new Employee(50000, "Rohit");

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

        e.setName("Rohit Patil");
        System.out.println("Updated Name: " + e.getName());
    }
}
