package GuviTasks1;

import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		System.out.print("Enter Number: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num=input.nextInt();
		int reverse=0;
		while(num!=0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
			System.out.println(reverse);
	}

}
