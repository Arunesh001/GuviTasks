package GuviTasks1;

import java.util.Scanner;
public class Question2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int num = input.nextInt();
		if(num>=0) {
			System.out.println("The given number is Positive");
		}else {
			System.out.println("The given number is Negative");
		}
	}
}




