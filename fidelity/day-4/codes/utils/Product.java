package com.fidelity.java.utils;

import java.util.Objects;

public class Product {
	private Integer productId;
	private String productName;

	public Product(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return String.format("Product [%-5d | %-15s ]", productId, productName);
	}

	@Override
	public int hashCode() {
		//System.out.println("hashCode() executed");
		return Objects.hash(productId, productName);			
	}

	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals() executed");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName);
	}

	
}
