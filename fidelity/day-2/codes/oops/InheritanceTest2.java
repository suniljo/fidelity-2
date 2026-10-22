package com.fidelity.java.oops;

class A2{
	A2(){
		//super();
		System.out.println("Class A2 constructor");
	}
}

class B2 extends A2{
	B2(){
		//super();
		System.out.println("Class B2 constructor");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		new B2();
	}

}
