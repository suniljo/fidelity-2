package com.fidelity.java.oops;

class A{
	int a = 10;
	void displayA() {
		System.out.println("in class A --> " + a);
	}
}

class B extends A{
	int b = 20;
	void displayAB() {
		System.out.println("in class B --> " + a + " | " + b);
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a + " | " + obj.b);
		
		obj.displayA();
		obj.displayAB();
	}

}
