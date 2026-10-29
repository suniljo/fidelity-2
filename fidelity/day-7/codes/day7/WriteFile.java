package com.fidelity.java.day7;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//try(FileOutputStream fout = new FileOutputStream("C:\\Fidelity\\batch-2\\fidelity.txt")){
		try(FileOutputStream fout = new FileOutputStream("C:\\Fidelity\\batch-2\\fidelity.txt", true)) { //appending mode	
			String str = "Fidelity's mission is to strengthen the financial well-being of our customers and deliver better outcomes for the clients and businesses we serve.\n\n";
			byte[] byteData = str.getBytes();
			fout.write(byteData);
			
			System.out.println("file saved");
		}
		

	}

}
