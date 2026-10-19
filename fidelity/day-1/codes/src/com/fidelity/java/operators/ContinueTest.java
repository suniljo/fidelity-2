package com.fidelity.java.operators;

public class ContinueTest {

	public static void main(String[] args) {
		System.out.println("Odd Numbers from 1 to 20 are: ");
		
		for(int i=1; i<=20; i++) {
			int rem = i % 2;
			if(rem == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
