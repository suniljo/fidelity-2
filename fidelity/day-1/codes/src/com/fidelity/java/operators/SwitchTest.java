package com.fidelity.java.operators;

public class SwitchTest {

	public static void main(String[] args) {
		int n = 0;
		
		/*
		if(n==0){
			System.out.println("A");
		}else if(n==1) {
			System.out.println("B");
		}else if(n==2) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		*/
		
		switch(n) {
		 case 0:
		   System.out.println("A");
		   break;
		 case 1:
		   System.out.println("B");
		   break;
		 case 2:
		   System.out.println("C");
		   break;
		 default:
		   System.out.println("D");	 
		}
	}

}
