package q4;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library l = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Book");
			System.out.println("2. Display All book details");
			System.out.println("3. Search Book by author");
			System.out.println("4. count no of books by book Name");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the isbn no: ");
				int isbn = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter book Name: ");
				String bookName = sc.nextLine();
				System.out.println("Enter Author Name: ");
				String author = sc.nextLine();
				Book book = new Book(isbn, bookName, author);
				l.addBook(book);
				System.out.println("Book Added succesfully");
				System.out.println("========================================");
				break;
				
			case 2:
				List<Book> allBooks = l.viewAllBooks();
				if(allBooks.isEmpty()) {
					System.out.println("List is Empty");
				}
				else {
					for(Book i : allBooks) {
						System.out.println("ISBN: "+i.getIsbn());
						System.out.println("Book Name: "+i.getBookName());
						System.out.println("Author: "+i.getAuthor());
					}
				}
				break;
			
			case 3: 
				System.out.println("Enter the author Name: ");
				String searchAuthor = sc.nextLine();
				
				List<Book> booksByAuthor = l.viewBooksByAuthor(searchAuthor);
				if(booksByAuthor.isEmpty()) {
					System.out.println("None of the book published by the author "+searchAuthor);
				}
				else {
					for(Book i : booksByAuthor) {
						System.out.println("ISBN: "+i.getIsbn());
						System.out.println("Book Name: "+i.getBookName());
						System.out.println("Author: "+i.getAuthor());
					}
				}
				break;
				
			case 4:
				System.out.println("Enter Book Name: ");
				String searchBookName = sc.nextLine();
				
				int bookCount = l.countNoOfBook(searchBookName);
				System.out.println("Number of books with name '"+searchBookName+"' "+bookCount);
				break;
			
			case 5:
				System.out.println("Exiting the program. ");
				sc.close();
				System.exit(0);
			
			default:
				System.out.println("Invalid choice. Please enter a valid option. ");
			}
		}

	}

}
