class Employee {
    String name;
    int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary); 
        this.department = department;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 75000, "IT");
        
        System.out.println("Manager Details:");
        System.out.println("----------------");
        manager.displayInfo();
    }
}
