package com.fidelity.java.utils;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Vishnu")); //true
		System.out.println(names.add("Vishnu")); //false
		System.out.println(names.add("Hema"));
		names.add("Hemasri");
		names.add("Khaja");
		names.add("Darshan");
		names.add("Bhargavi");
		System.out.println(names + " | size="+names.size());
	}

}
