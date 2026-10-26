package com.fidelity.java.utils;

import java.util.HashSet;
import java.util.Set;

public class ProductHashSetTest {

	public static void main(String[] args) {
		Set<Product> productsSet = new HashSet<Product>();
		
		Product prod1 = new Product(101, "Mobile");
		Product prod2 = new Product(101, "Mobile");
		
		System.out.println(prod1.hashCode() + " - " + prod2.hashCode());
		System.out.println(prod1.equals(prod2));
		
		productsSet.add(prod1);
		productsSet.add(prod2);
		
		for(Product prod : productsSet) {
			System.out.println(prod);
		}
	}

}
