package com.fidelity.java.utils;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + " - Size=" + names.size());
		
		names.add("Abhishesk");
		names.add("Amit");
		names.add("Amit");
		names.add("Arshita");
		names.add("Ashutosh");
		names.add("Amit");
		names.add("Bhargavi");
		names.add("Puja");
		names.add("Amit");
		System.out.println(names + " - Size=" + names.size());
		
		names.add(2, "Darshan");
		names.set(4, "ARSHITA");
		
		System.out.println(names + " - Size=" + names.size());	
		System.out.println("is \"Amit\" in list = " + names.contains("Amit"));
		System.out.println("index of  \"Amit\" in list = " + names.indexOf("Amit"));
		System.out.println("last index of  \"Amit\" in list = " + names.lastIndexOf("Amit"));
		System.out.println("index of  \"Sanjay\" in list = " + names.indexOf("Sanjay")); //-1
		
		System.out.println("persoon index 4 = " + names.get(4));
		//System.out.println("persoon index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("remove(Amit) -- " + names.remove("Amit") );
		System.out.println("remove(index) -- " + names.remove(0));
		System.out.println(names + " - Size=" + names.size());	
		System.out.println(names + " - Size=" + names.size());	
	}

}
