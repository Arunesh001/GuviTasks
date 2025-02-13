package GuviTask4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {
	 HashMap<String, Integer> student;

    public StudentHashMap() {
    	student = new HashMap<>();
    	}

    public void addStudent(String name, int grade) {
    	student.put(name, grade);
    	System.out.println( name + " Scored "+ grade+" grade ");
    	}

public void removeStudent(String name) {
	if (student.containsKey(name)) {
		student.remove(name);
		System.out.println("Student " + name + " removed.");
		} else {
			System.out.println("Student " + name + " not found.");
			}
	}
public void displayGrade(String name) {
	if (student.containsKey(name)) {
		int grade = student.get(name);
		System.out.println("Grade :" + grade);
		}else {
			System.out.println("Student " + name + " not found.");
			}
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StudentHashMap manager = new StudentHashMap();
	
	while (true) {
		
        System.out.println("1. Add a new student");
        System.out.println("2. Remove a student");
        System.out.println("3. Display a student's grade");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------------");
        switch (choice) {
        case 1:
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student grade: ");
            int grade = sc.nextInt();
            manager.addStudent(name, grade);
            break;

        case 2:
            System.out.print("Enter student name: ");
            String removeName = sc.nextLine();
            manager.removeStudent(removeName);
            break;

        case 3:
        	System.out.print("Enter student name : ");
            String displayName = sc.nextLine();
            manager.displayGrade(displayName);
            break;

        case 4:
            System.out.println("Exiting program...");
            sc.close();
            System.exit(0);
            break;

        default:
            System.out.println("Invalid choice! Please select a valid option.");
            }
        }
	}
}

