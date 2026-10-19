package com.fidelity.java.operators;

public class Naturals3 {

	public static void main(String[] args) {
		printNaturals(); // method call
		printNaturals(); // method call
		Naturals3.printNaturals(); // method call
	}
	
	// method definition to print first 10 Natural Numbers
	private static void printNaturals(){
		System.out.println("First 10 Natural Numbers are:");
		
		int n = 1;
		
		while(n < 11) {
			if(n != 10) {
				System.out.print(n + ", ");
			}else {
				System.out.println(n);
			}
			n = n + 1;
		}
		System.out.println();
	}
}
