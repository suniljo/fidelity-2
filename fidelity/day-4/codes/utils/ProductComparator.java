package com.fidelity.java.utils;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getProductId() > o2.getProductId())
			return 1;
		else if(o1.getProductId() < o2.getProductId())
			return -1;
		else
			return 0;
	}
	
}
