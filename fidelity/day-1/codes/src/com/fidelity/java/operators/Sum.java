package com.fidelity.java.operators;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int fno = sc.nextInt();
		
		System.out.print("enter second number: ");
		int sno = sc.nextInt();
		
		int sum = fno + sno;
		
		System.out.println("Sum = " + sum);
		System.out.printf("%d + %d = %d", fno, sno, sum);
	}

}
