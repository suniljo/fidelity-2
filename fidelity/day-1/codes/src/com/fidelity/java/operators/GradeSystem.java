package com.fidelity.java.operators;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter subject mark: ");
		int mark = sc.nextInt();
		
		String grade = "";
		
		if(mark >= 90) {
			grade = "A+";
		} else if( mark >=80 && mark < 90) {
			grade = "A";
		}else if(mark >= 70) {
			grade = "B";
		}else if(mark >= 60) {
			grade = "C";
		}else {
			grade = "Fail";
		}
		
		System.out.println(grade);
		
		sc.close();
	}

}
