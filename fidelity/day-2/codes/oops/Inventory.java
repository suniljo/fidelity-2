package com.fidelity.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		/*
		System.out.println(prod.productId + " | " + prod.productName);
		prod.productId = 101;
		prod.productName = "Mobile";
		
		System.out.println(prod.productId + " | " + prod.productName);
		*/
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		
		prod.setProductId(101);
		prod.setProductName("Mobile");
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		System.out.println();
		
		System.out.println(prod.getClass().getName());
		System.out.println(Integer.toHexString(prod.hashCode()));
		
		System.out.println(prod); //toString()
	}

}
