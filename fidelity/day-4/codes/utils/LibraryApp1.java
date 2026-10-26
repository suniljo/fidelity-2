package com.fidelity.java.utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.fidelity.java.utils.Book;


public class LibraryApp1 {

	static ArrayList<Book> books = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int choice;

		do {
			System.out.println("\n===== LIBRARY MANAGEMENT =====");
			System.out.println("1. Add New Stock");
			System.out.println("2. Search Book with ID");
			System.out.println("3. Search Books of an Author");
			System.out.println("4. Update a Book");
			System.out.println("5. Remove a Book by ID");
			System.out.println("6. List All Books");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");

			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				addBook();
				break;

			case 2:
				searchBookById();
				break;

			case 3:
				searchBooksByAuthor();
				break;

			case 4:
				updateBook();
				break;

			case 5:
				removeBook();
				break;

			case 6:
				listAllBooks();
				break;

			case 7:
				System.out.println("Thank you for using LibraryApp1!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 7);

		sc.close();
	}

	// 1. Add New Stock
	static void addBook() {
		System.out.print("Enter Book ID: ");
		Long id = Long.parseLong(sc.nextLine());

		if (findBook(id) != null) {
			System.out.println("Book ID already exists!");
			return;
		}

		System.out.print("Enter Book Title: ");
		String title = sc.nextLine();

		System.out.print("Enter Author: ");
		String author = sc.nextLine();

		books.add(new Book(id, title, author));
		System.out.println("Book added successfully!");
	}

	// 2. Search Book with ID
	static void searchBookById() {
		System.out.print("Enter Book ID: ");
		Long id = Long.parseLong(sc.nextLine());

		Book book = findBook(id);

		if (book != null)
			System.out.println(book);
		else
			System.out.println("Book not found!");
	}

	// 3. Search Books of an Author
	static void searchBooksByAuthor() {
		System.out.print("Enter Author Name: ");
		String author = sc.nextLine();

		boolean found = false;

		for (Book book : books) {
			if (book.getBookAuthor().equalsIgnoreCase(author)) {
				System.out.println(book);
				found = true;
			}
		}

		if (!found)
			System.out.println("No books found for this author.");
	}

	// 4. Update a Book
	static void updateBook() {
		System.out.print("Enter Book ID to update: ");
		Long id = Long.parseLong(sc.nextLine());

		Book book = findBook(id);

		if (book == null) {
			System.out.println("Book not found!");
			return;
		}

		System.out.print("Enter New Title: ");
		book.setBookTitle(sc.nextLine());

		System.out.print("Enter New Author: ");
		book.setBookAuthor(sc.nextLine());

		System.out.println("Book updated successfully!");
	}

	// 5. Remove a Book by ID
	static void removeBook() {
		System.out.print("Enter Book ID to remove: ");
		Long id = Long.parseLong(sc.nextLine());

		Book book = findBook(id);

		if (book != null) {
			books.remove(book);
			System.out.println("Book removed successfully!");
		} else {
			System.out.println("Book not found!");
		}
	}

	// 6. List All Books
	static void listAllBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available.");
			return;
		}

		System.out.println("\nID | Book Title | Author");

		for (Book book : books) {
			System.out.println(book);
		}
	}

	// Common method to find a book by ID
	static Book findBook(Long id) {
		for (Book book : books) {
			if (book.getBookId().equals(id)) {
				return book;
			}
		}

		return null;
	}
}
