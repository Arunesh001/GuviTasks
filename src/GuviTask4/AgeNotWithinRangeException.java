package GuviTask4;

@SuppressWarnings("serial")
//This is custom unchecked Exception or runtime exception for age
public class AgeNotWithinRangeException extends RuntimeException{
		public AgeNotWithinRangeException(int age) {
	        super("Age " + age + " is not within the valid range (15-21).");
	    }
	
}
