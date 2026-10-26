package com.fidelity.java.utils;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
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
