package GuviTask4;

import java.util.Scanner;

public class InduxOutOfBoundException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.print("Enter Number :");
		int num=sc.nextInt();
		try {
			System.out.println(array[num]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of range please enter 0 TO 6 ");
		}
		sc.close();
	}
}
