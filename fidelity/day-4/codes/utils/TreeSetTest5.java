package com.fidelity.java.utils;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest5 {

	public static void main(String[] args) {
		//Set<String> names = new TreeSet<String>()
		Set<String> names = new TreeSet<String>(new NamesComparator());

		names.add("Charles");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Sachin");
		names.add("Bharath");
		names.add("Abhay");
		names.add("Valerie");
		names.add("Binu");
		
		System.out.println(names);		
	}
}

class NamesComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//return 0;
		//return 1;
		//return -1;
		int n = o1.compareTo(o2);
		if(n > 0)
			return -1;
		else if(n < 0)
			return 1;
		else
			return 0;
	}
	
}
