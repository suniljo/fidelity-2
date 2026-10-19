package com.fidelity.java.operators;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which number's multiplication table? ");
		int n = sc.nextInt();
		
		printTable(n);
	}

	private static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			int prod = n * i;
			System.out.printf("%2d x %2d = %3d \n", n, i, prod);
		}
		
	}

}
