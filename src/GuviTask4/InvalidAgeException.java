package GuviTask4;

@SuppressWarnings("serial")
public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		super("Invalid age for votter");
	}
	
}
