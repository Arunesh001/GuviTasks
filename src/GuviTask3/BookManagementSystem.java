package GuviTask3;

import java.util.Scanner;
public class BookManagementSystem {

	public static void main(String[] args) {
		 Library library = new Library();
	     Scanner scanner = new Scanner(System.in);
	     int choice;
	     
	     //Here "while" is used to execute these steps repeatedly until user wants to exit
	     while (true) {
	         System.out.println("\nLibrary Management System");
	         System.out.println("1. Add Book");
	         System.out.println("2. Remove Book");
	         System.out.println("3. Search Book");
	         System.out.println("4. Display Books");	       
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice: ");
	         choice = scanner.nextInt();
	         
	         //Here switch case used for user interaction menu 
	         switch (choice) {
	             case 1:
	                 System.out.print("Enter Book ID: ");
	                 int bookID = scanner.nextInt();
	                 scanner.nextLine(); // Consume newline
	                 System.out.print("Enter Title: ");
	                 String title = scanner.nextLine();
	                 System.out.print("Enter Author: ");
	                 String author = scanner.nextLine();
	                 library.addBook(new Book(bookID, title, author));
	                 break;

	             case 2:
	                 System.out.print("Enter Book ID to remove: ");
	                 int removeID = scanner.nextInt();
	                 library.removeBook(removeID);
	                 break;

	             case 3:
	                 System.out.print("Enter Book ID to search: ");
	                 int searchID = scanner.nextInt();
	                 library.searchBook(searchID);
	                 break;

	             case 4:
	            	 library.displayBook();
	                 break;

	             case 5:
	            	 System.out.println("Exiting Library Management System.");
	                 scanner.close();
	                 return;
	                 
	             default:
	                 System.out.println("Invalid choice! Try again.");
	         }
	     }

	}

}
