package com.fidelity.java.exceptions;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//int x = 10/0; //java.lang.ArithmeticException
		
		int [] marks = new int[10];
		//System.out.println(marks[10]); //java.lang.ArrayIndexOutOfBoundsException
		
		String str = "625";
		System.out.println(25 + str); //25625
		
		int n = Integer.parseInt(str);
		System.out.println(25 + n);
		
		//n = Integer.parseInt("A"); //java.lang.NumberFormatException
		//System.out.println(n);
		
		//String name = "Sanjay";
		String name = null;
		System.out.println(name + " | " + name.length()); //java.lang.NullPointerException
		System.out.println("-- done --");
	}

}
