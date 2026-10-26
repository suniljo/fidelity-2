package com.fidelity.java.utils;

import java.util.Scanner;
import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter an equation: ");
		String equation = sc.nextLine();

		boolean isValid = isValidEquation(equation);

		if (isValid)
			System.out.println(equation + " is Valid");
		else
			System.out.println(equation + " is NOT Valid");
		sc.close();
	}

	private static boolean isValidEquation(String equation) {
		Stack<Character> st = new Stack<Character>();
		try {
			for (int i = 0; i < equation.length(); i++) {
				char ch = equation.charAt(i);
				if (ch == '(')
					st.push(ch);
				else if (ch == ')')
					st.pop();
			} // for

			if (st.isEmpty()) {
				return true;
			}
		} catch (Exception ex) {
			return false;
		}
		return false;
	}
}
