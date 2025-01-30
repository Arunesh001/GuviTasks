package GuviTasks1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the purchase ammount: ");
		double purchase_amount = input.nextDouble();
	double discount;
		
		if(purchase_amount<=500) {
			discount=0;//0% 
		}else if(purchase_amount<=1000) {
			discount=10;//10%
		}else {
			discount=20;//0%
		}
		
		System.out.println("Total bill generated: "+purchase_amount);
		System.out.println("Discount applied "+discount+"%");
		System.out.println("Amount to be paid: "+(purchase_amount-(purchase_amount*discount)/100));
		
	}

}
