package com.fidelity.java.operators;


import java.util.Scanner;

public class EmailValidation {

    // Method to validate email
    public static boolean validateEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        
        boolean isValidEmail = validateEmail(email);
        
        if (isValidEmail) {
            System.out.println(email + " --> Valid Email Address");
        } else {
            System.out.println(email + " --> Invalid Email Address");
        }

        isValidEmail = validateEmailWithoutRegularExpression(email);
        
        if (isValidEmail) {
            System.out.println(email + " --> Valid Email Address");
        } else {
            System.out.println(email + " --> Invalid Email Address");
        }        
        sc.close();
    }
    
    public static boolean validateEmailWithoutRegularExpression(String email) {
    	int atPosition = email.indexOf('@');
        int dotPosition = email.lastIndexOf('.');

        // Check basic email conditions
        if (atPosition <= 0) {
            return false;
        }

        if (dotPosition < atPosition + 2) {
            return false;
        }

        if (dotPosition == email.length() - 1) {
            return false;
        }

        if (email.contains(" ")) {
            return false;
        }

        return true; 	
    }
}

