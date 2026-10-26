package com.fidelity.java.utils;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest3 {
	public static void main(String[] args) {
		/*
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(123.45);
		set.add(345);
		set.add(true);
		*/

		Set set = new TreeSet();
		set.add("aaa");
		set.add("bbb");
		set.add(123.45); //java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Double 
		set.add(345);
		set.add(true);
		System.out.println(set);
	}
}
