package GuviTask2;
import java.util.Scanner;
public class Account {
    private  double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with argument
    public Account(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // this method is used to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Account myAccount = new Account(0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount : ");
        double i_deposit = sc.nextDouble();
        System.out.print("Enter withdraw amount : ");
        double i_withdraw = sc.nextDouble();
        System.out.println();
        myAccount.deposit(i_deposit);
        myAccount.withdraw(i_withdraw);
        myAccount.displayBalance();
    }
}