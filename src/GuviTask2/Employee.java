package GuviTask2;

public class Employee extends Person {
    int employeeID;
    double salary;

    // Constructor to initialize Employee details
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Calls the constructor of the Person class
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void display() {
        super.display(); // Calls the display method from the Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}
