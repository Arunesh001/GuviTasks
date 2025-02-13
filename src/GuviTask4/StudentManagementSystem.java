package GuviTask4;

import java.util.*;

public class StudentManagementSystem {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Roll Number : ");
		int roll_no1 = sc.nextInt();
		sc.nextLine();
		String name1 = null;
		try {
			System.out.print("Enter Name : ");
		    name1 = sc.nextLine();
		} catch (NameNotValidException e) {
			System.out.println("Exception: " + e.getMessage());
		}	
		int age1=0;
		try {
			System.out.print("Enter Age : ");
			age1 = sc.nextInt();
		} catch (AgeNotWithinRangeException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		sc.nextLine();
		System.out.print("Enter Course : ");
		String course1 = sc.nextLine();
		
		//creating method for class student1 it will call the parameterized constructor
		Student1 obj2 = new Student1(roll_no1,name1,age1,course1);
		obj2.display(roll_no1, name1, age1, course1);
		obj2.NameException(name1);
		obj2.AgeException(age1);
	}

}


