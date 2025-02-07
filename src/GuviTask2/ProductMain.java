package GuviTask2;
import java.util.Scanner;

public class ProductMain {
	
	//Here the method is used to calculate all products price
	public double total(Product[] products) {
		 double totalAmount = 0;
	        for (int i = 0;i<products.length;i++) {
	            totalAmount += products[i].price * products[i].quantity;
	        }
	        return totalAmount;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Product[] products = new Product[5];
	//Here the for loop is used to getting five input from user and then stored in array 
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the product : "+(i+1));
			
			System.out.print("ProductID : ");
			int pid = scan.nextInt();
			System.out.print("Price : ");
			double price = scan.nextDouble();
			System.out.print("Quantity : ");
			int quantity = scan.nextInt();
			System.out.println();
			products[i] = new Product(pid,price,quantity);
		}
		
	//Here the for loop is used to find the highest price product ID 
		Product highest_price_product = products[0];

		
		for (int i = 1;i<products.length;i++) {
			if(products[i].price * products[i].quantity> highest_price_product.price * highest_price_product.quantity) {
				highest_price_product = products[i];
			}
	
		}
		ProductMain obj = new ProductMain();
		double total_amount=obj.total(products);
	
		System.out.println();
		System.out.println("Highest price Product ID : " + highest_price_product.pid);
	    System.out.println("Total amount spent on all the products : " + total_amount);

	}

}
