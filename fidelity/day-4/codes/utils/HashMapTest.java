package com.fidelity.java.utils;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Abhishek", 25000f)); //null
		System.out.println(bank.put("Abhishek", 12500.5f)); //25000.0
		System.out.println(bank.put("Sumith", 45000f)); //null
		
		bank.put("Charles", 25000f);
		bank.put("Rahul", 38750.5f);
		bank.put("Sagar", 85000f);
		
		System.out.println(bank);
		System.out.println();		

		bank.put(null,  null);
		System.out.println(bank);
		System.out.println();		
	}

}
