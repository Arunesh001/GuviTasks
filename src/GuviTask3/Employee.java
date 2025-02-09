package GuviTask3;

public class Employee implements Taxable{
	private int empId;
	private String name;
	private double salary;
	
	//Constructors for initialize the parameters
	public Employee(int empId,String name,double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public void calcTax() {
		double IncomeTax = (incomeTax/100) * salary;
		System.out.println("Employee ID : "+empId);
		System.out.println("Name : "+name );
		System.out.println("Salary per year : "+salary );
		System.out.println("Payable Tax : "+IncomeTax );
	}

}
