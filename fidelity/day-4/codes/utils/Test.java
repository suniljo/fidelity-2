package com.fidelity.java.utils;

public class Test {
	public static void main(String[] args) {
		int hashCode = 1498;
		int bucketIndex = hashCode & 15;
		System.out.println(bucketIndex);
	}
}
