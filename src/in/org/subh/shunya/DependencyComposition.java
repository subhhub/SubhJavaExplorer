package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.List;

/**
 * @author esubkew
 *
 * Java program to illustrate the concept of Composition
 * 
 * In this example a library can have no. of books on same or different subjects. 
 * So, If Library gets destroyed then All books within that particular library will be destroyed. 
 * i.e. book can not exist without library. That’s why it is composition.
 *
 */
public class DependencyComposition {

	public static void main(String[] args) {

		// Creating the Objects of Book class.
		Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains the
		// no. of books.
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		Library library = new Library(books);

		List<Book> bks = library.getTotalBooksInLibrary();
		for (Book bk : bks) {

			System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
		}
	}
}

// class book
class Book {

	public String title;
	public String author;

	Book(String title, String author) {

		this.title = title;
		this.author = author;
	}
}

// Libary class contains list of books.
class Library {

	// reference to refer to list of books.
	private final List<Book> books;

	Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {

		return books;
	}

}
