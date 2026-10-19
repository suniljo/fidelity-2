package com.fidelity.java.operators;

public class FormattedOutput {

	public static void main(String[] args) {
		float data = 10f / 3;
		System.out.println(data);
		System.out.printf("%f\n", data);
		System.out.printf("%.0f\n", data);
		System.out.printf("%.1f\n", data);
		System.out.printf("%.2f\n", data);
		System.out.printf("%.3f\n", data);
		System.out.printf("%.8f\n", data);
	}

}
