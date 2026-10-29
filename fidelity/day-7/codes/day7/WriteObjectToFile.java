package com.fidelity.java.day7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {

	public static void main(String[] args) throws Exception {
		//Product prod = new Product(101, "Mobile", 78500.5f);
		
		Product prod = new Product();
		prod.setProductId(101);
		prod.setProductName("Personal Computer");
		prod.setProductPrice(78500.5f);
		System.out.println(prod);
		
		FileOutputStream fout = new FileOutputStream("src/com/fidelity/java/day7/ProductsList.ser");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(prod);
		
		System.out.println("Product persisted in file!!!");
	}
}