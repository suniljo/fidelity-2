
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = 127;
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		System.out.println(b);
		
		b = (byte) 128;
		System.out.println(b);

		b = (byte) 1000;
		System.out.println(b);	
		
		int n = 2147483647;
		System.out.println(n);
		
		//long pop = 2147483648; //The literal 2147483648 of type int is out of range 
		
		//long pop = 2147483648l;
		long pop = 2147483648L;
		System.out.println("World Population = " + pop);
	}

}
