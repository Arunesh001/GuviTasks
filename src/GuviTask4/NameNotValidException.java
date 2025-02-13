package GuviTask4;

@SuppressWarnings("serial")
//This is custom unchecked Exception or runtime exception to check valid name
public class NameNotValidException extends RuntimeException{
	public NameNotValidException(String name) {
        super("Name :" + name + " contains invalid characters. Only alphabets are allowed.");
    }
}

