package com.fidelity.java.exceptions;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		String isAnyOneInQueue = "Y";
		Scanner sc = new Scanner(System.in);
		
		do {
		  try {	
			System.out.print("enter the age of voter: ");
			int voterAge = sc.nextInt();
			
			if(voterAge >= 18) {
				System.out.println("Voting Done... <beep><beep>");
			}else {
				throw new InvalidVoterAgeException("voter age should be >= 18!");
			}
		  }catch(Exception ex) {
			  System.err.println("ERROR: " + ex.toString());
		  }
		  System.out.println("=".repeat(70));
			System.out.print("anone else in queue? [Y/ N]: ");
			isAnyOneInQueue = sc.next();
			
		} while(isAnyOneInQueue.equalsIgnoreCase("Y"));

	}

}
