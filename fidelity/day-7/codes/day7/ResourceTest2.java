package com.fidelity.java.day7;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements Closeable {
	public void businessLogic() {
		System.out.println("MyResource-1 Businesss Logic");
	}
	public void close() throws IOException{
		System.out.println("MyResource-1 close method");
	}
}

class MyResource2 implements AutoCloseable {
	public void businessLogic() {
		System.out.println("MyResource-2 Businesss Logic");
	}
	public void close() throws Exception{
		System.out.println("MyResource-2 close method");
	}
}

public class ResourceTest2 {

	public static void main(String[] args) throws Exception {
		
		try(MyResource1 rs1 = new MyResource1(); MyResource2 rs2 = new MyResource2()){
			rs1.businessLogic();
			rs2.businessLogic();
		}
		
		System.out.println("===== DONE =====");
	}

}
