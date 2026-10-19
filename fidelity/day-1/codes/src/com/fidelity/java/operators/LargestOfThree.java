package com.fidelity.java.operators;

public class LargestOfThree {

	public static void main(String[] args) {
		int x = 10;
		int y = 28;
		int z = 25;
		
		int lar = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;
				
		System.out.println("Largest of (" + x + ", " + y + ", " + z + ") = " + lar);
		System.out.printf("Largest of (%d, %d, %d) = %d \n", x, y, z, lar);
	}

}
