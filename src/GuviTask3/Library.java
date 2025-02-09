package GuviTask3;

public class Library {
	private Book[] books;
	private int count;
	
	//Here constructor creates array object with 5 size 
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	
	//Method to add a book to the library
	public void addBook(Book book) {
		if( count < books.length ) {
			books[count] = book;
			count++;
			System.out.println("Book added successfully.");
		}else {
	         System.out.println("Library is full!");
		}
	}
	
	//Method to remove a book from library
	public void removeBook(int bookID) {
		for(int i=0;i<count;i++) {
			if(books[i].getbookID() == bookID) {
				books[i] = null ;
				System.out.println("Book removed successfully.");
				return;
			}
		}
		System.out.println("Book not found");
	}
	
	//Method to search a book on library
	public void searchBook(int bookID) {
		for(int i = 0;i < count;i++) {
			if(books[i].getbookID() == bookID) {
				System.out.println("Book found : ");
				books[i].displayBook();
				return;
			}
			
		}
		System.out.println("Book not found");
	}
	
	//Method to display a book from library
	 public void displayBook() {
		 if (count == 0) {
	         System.out.println("No books available.");
	     } else {
	         System.out.println("Library Books:");
	         for (int i = 0; i < count; i++) {
	             books[i].displayBook();
	         }
	     }
	 }
	
}
