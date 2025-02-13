package GuviTask4;

import java.util.Scanner;

public class VoterMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter voter ID :");
		int voterID=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name :");
		String name = sc.nextLine();
		int age = 0;
		try {
			System.out.print("Enter Age :");
			age = sc.nextInt();
		} catch (InvalidAgeException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		Voter obj= new Voter(voterID,name,age);
		obj.display();
		sc.close();
	}
}
