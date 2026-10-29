package com.fidelity.java.day7;

import java.util.Scanner;

public class ResourceTest1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter your name: ");
			String myName = sc.nextLine();
		
			System.out.println("Hello, " + myName);
		} 
	}

}
