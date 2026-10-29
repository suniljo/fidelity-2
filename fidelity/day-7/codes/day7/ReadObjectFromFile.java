package com.fidelity.java.day7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {

	public static void main(String[] args) throws Exception{
		ObjectInputStream oin = new ObjectInputStream(
									new FileInputStream("src/com/fidelity/java/day7/ProductsList.ser")
								);
		
		Object readObject = oin.readObject();
		
		if(readObject instanceof Product) {
			Product prod = (Product)readObject;
			System.out.println(prod);
		}
		
		oin.close();
	}
}
