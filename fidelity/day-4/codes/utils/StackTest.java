package com.fidelity.java.utils;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println(st + " |size = " + st.size());
		System.out.println("is stack empty = " + st.isEmpty());
		//System.out.println(st.pop()); //java.util.EmptyStackException

		st.push(10);
		System.out.println("10 is in location " + st.search(10)); //1
		
		st.push(Integer.valueOf(25));
		System.out.println("10 is in location " + st.search(10)); //2
		
		st.push(32);		
		System.out.println("10 is in location " + st.search(10)); //3
		
		System.out.println(st + " |size = " + st.size()); //3
		
		System.out.println("peek() --- " + st.peek()); //32
		System.out.println("pop() --- " + st.pop()); //32
		System.out.println(st + " |size = " + st.size()); //2
		
		System.out.println(st.empty());
		System.out.println(st + " |size = " + st.size());
		
		st.clear();
		System.out.println(st + " |size = " + st.size());
	}

}
