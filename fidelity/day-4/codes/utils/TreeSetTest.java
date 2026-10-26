package com.fidelity.java.utils;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Vishnu")); //true
		System.out.println(names.add("Vishnu")); //false
		System.out.println(names.add("Hema"));
		names.add("Hemasri");
		names.add("Khaja");
		names.add("Darshan");
		names.add("Bhargavi");
		System.out.println(names + " | size="+names.size());
		
		names.add(null); //java.lang.NullPointerException

	}

}
