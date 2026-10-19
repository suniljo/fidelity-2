package com.fidelity.java.operators;

public class Naturals2 {

	public static void main(String[] args) {
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

	}

}
