package GuviTask3;

import java.util.Scanner;

public class DriverMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Accept Employee details
	        System.out.print("Enter Employee ID: ");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Enter Employee Name: ");
	        String empName = scanner.nextLine();
	        System.out.print("Enter Employee Salary Per Year: ");
	        double salary = scanner.nextDouble();
	        Employee emp = new Employee(empId, empName, salary);
	        emp.calcTax();
	        System.out.println("-------------------------------------- ");

	        // Accept Product details
	        System.out.print("Enter Product ID: ");
	        int pid = scanner.nextInt();
	        System.out.print("Enter Product Price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Enter Product Quantity: ");
	        int quantity = scanner.nextInt();
	        Product product = new Product(pid, price, quantity);
	        
	        product.calcTax();

	       

	}

}
