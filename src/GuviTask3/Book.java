package GuviTask3;

public class Book {
	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;
	
	//This constructor is used to initialize the Book attributes 
	public Book(int bookID,String title,String author) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	//Here using getter methods
	public int getbookID() {
		return bookID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean getisAvailable() {
		return isAvailable;
	}
	
	//Here using setter methods
	public void setTitle(String title) {
		 this.title = title;
	}
	
	public void setAuthor(String author) {
		 this.author = author;
	}
	
	public void displayBook() {
	     System.out.println("Book ID: " + bookID);
	     System.out.println("Title: " + title);
	     System.out.println("Author: " + author);
	     System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
	     System.out.println();
	}
		
}
