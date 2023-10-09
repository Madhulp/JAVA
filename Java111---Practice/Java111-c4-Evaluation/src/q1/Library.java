package q1;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> b = new ArrayList<>();
		b.add(new Book(1, "Name1", "Author1"));
		b.add(new Book(2, "Name2", "Author2"));
		b.add(new Book(3, "Name3", "Author3"));
		
		for(Book i: b) {
			System.out.println(i);
		}
		

	}

}
