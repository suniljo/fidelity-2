package com.fidelity.java.operators;

import java.util.Scanner;

public class DataEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your first name: " );
		String fname = sc.next();
		
		System.out.println("enter your last name: ");
		String lname = sc.next();
		
		System.out.print("enter your age: ");
		int age = sc.nextInt();
		
		System.out.printf("Hello %s %s, you are %d years of age!!", fname, lname, age);
		
		sc.close();
	}

}
