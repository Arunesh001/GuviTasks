package GuviTasks1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int smallno;
		 if (num1 <= num2 && num1 <= num3) {
	            smallno = num1;
	        } else if (num2 <= num1 && num2 <= num3) {
	            smallno = num2;
	        } else {
	            smallno = num3;
	        }
		 System.out.println("The smallest number is "+smallno);

	}

}


