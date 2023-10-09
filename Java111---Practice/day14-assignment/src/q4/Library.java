package q4;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book) {
		bookList.add(book);
	}

	boolean isEmpty() {
	   return bookList.isEmpty();
	}
	
	List<Book> viewAllBooks(){
		List<Book> copyOfBookList = new ArrayList<>(bookList);
		return copyOfBookList;
	}
	
	List<Book> viewBooksByAuthor(String author){
		List<Book> booksByAuthor = new ArrayList<>();
		
		for(Book i : bookList) {
			if(i.getAuthor().equalsIgnoreCase(author)) {
				booksByAuthor.add(i);
			}
		}
		if(booksByAuthor.isEmpty()) {
			System.out.println("The List is empty");
		}
		return booksByAuthor;
	}
	
	int countNoOfBook(String bookName) {
		int count =0;
		
		for(Book i : bookList) {
			if(i.getBookName().equalsIgnoreCase(bookName)) {
				count++;
			}
		}
		return count;
		
	}
}
