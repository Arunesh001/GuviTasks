package GuviTask5;
import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your birthdate (yyyy-mm-dd): ");
     LocalDate birthDate = LocalDate.parse(scanner.nextLine());//Here getting input from user as Strings and convert as date format 
     LocalDate currentDate = LocalDate.now();//Here this line is used to get current date

     //Here calculating the year month and day 
     int year = currentDate.getYear() - birthDate.getYear();
     int month=currentDate.getMonthValue()-birthDate.getMonthValue();
     int day = currentDate.getDayOfMonth()-birthDate.getDayOfMonth();

     System.out.println("Your age is: " + year + " years,"+ month +" months "+day+" days.");

     scanner.close();
    }
}

	  