package com.fidelity.java.day7;

import java.io.FileWriter;

public class WriteFile2 {

	public static void main(String[] args) throws Exception {
		//try(FileWriter fout = new FileWriter("C:\\Fidelity\\batch-2\\fidelity.txt")){
		try(FileWriter fout = new FileWriter("C:\\Fidelity\\batch-2\\fidelity.txt", true)) { //appending mode	
			
			String str = "Fidelity's mission is to strengthen the financial well-being of our customers and deliver better outcomes for the clients and businesses we serve.\n\n";
			fout.write(str);
			
			System.out.println("file saved");
		}
		

	}

}
