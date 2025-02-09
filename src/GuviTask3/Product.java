package GuviTask3;

public class Product implements Taxable{
	private int pid;
	private double price;
	private int quantity;
	
	//Constructors for initialize the parameters  
	public Product(int pid,double price,int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public void calcTax() {
		double SalesTax = (salesTax/100) * price;
		double totalTax = SalesTax * quantity;
		System.out.println("Product ID : "+pid);
		System.out.println("Price      : "+price );
		System.out.println("Quantity   : "+quantity );
		System.out.println("Payable tax per unit: "+SalesTax );
		System.out.println("Payable tax all unit: "+totalTax );
	}

}
