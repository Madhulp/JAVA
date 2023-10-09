package q1;

public class Book {
	
	private Integer bookId;
	private String bookName;
	private String author;
	
	public Book(Integer bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	

}
