package GuviTask4;

import java.util.*;

public class Stack_collection {

	public static void main(String[] args) {
		  Stack<Integer> stack = new Stack<Integer>();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.print("\n1.Push 2.Pop 3.CheckEmpty 4.Exit: ");
	            int choice = sc.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter number: ");
	                stack.push(sc.nextInt());
	                System.out.println("Pushed!");
	            } else if (choice == 2) {
	                if (!stack.isEmpty()) {
	                    System.out.println("Popped: " + stack.pop());
	                } else {
	                    System.out.println("Stack is empty!");
	                }
	            } else if (choice == 3) {
	                System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
	            } else if (choice == 4) {
	                break;
	            } else {
	                System.out.println("Invalid choice!");
	            }
	        }
	        sc.close();
	        System.out.println(stack);

	}

}
