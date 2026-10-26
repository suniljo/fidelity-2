package com.fidelity.java.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String request = "";
		
		List<Book> libraryStock = new ArrayList<Book>();
		
		do {
			System.out.print("entre book id: ");
			long bid = sc.nextLong();
			sc.nextLine();
			
			System.out.print("enter book title: ");
			String btitle = sc.nextLine();
			
			System.out.print("enter author name: ");
			String bauthor = sc.nextLine();
			
			Book bk = new Book(bid, btitle, bauthor);
			libraryStock.add(bk);
			
			System.out.print("Book added to Library... Do you want to add new book? [y/n]: ");
			request = sc.next();
		}while(request.equalsIgnoreCase("Y"));
		
		System.out.println();
		printStock(libraryStock);
	}

	private static void printStock(List<Book> libraryStock) {
		for(Book bk : libraryStock) {
			System.out.println(bk);
			try {
				Thread.sleep(1500);
			}catch(Exception ex) {}
		}		
	}

}
