package com.fidelity.java.operators;

import java.util.Scanner;

public class MethodReturns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int fno = sc.nextInt();
		
		System.out.print("enter second number: ");
		int sno = sc.nextInt();
		
		int sum = findSum(fno, sno);
		System.out.printf("%d + %d = %d", fno, sno, sum);
	}

	private static int findSum(int fno, int sno) {
		int s = fno + sno;
		return s;
	}

}
