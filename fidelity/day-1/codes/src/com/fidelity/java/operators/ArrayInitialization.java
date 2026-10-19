package com.fidelity.java.operators;

public class ArrayInitialization {

	public static void main(String[] args) {
		//array initialization
		int[] marks = {85, 93, 74, 61, 88, 90};
		
		System.out.println("No of Subjects = " + marks.length);
		System.out.println();
		
		for(int i=0; i<marks.length; i++) {
			System.out.printf("Mark for Subject-%d = %d \n", (i+1), marks[i]);
		}
		System.out.println();
		
		//enhanced for loop from Java 5 (JDK1.5)
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println("-".repeat(100));
		float total = 1290;
		System.out.println(total);
		System.out.printf("%.2f\n", total);
		System.out.println("-".repeat(100));
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
