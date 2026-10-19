
public class LiteralsTest {

	public static void main(String[] args) {
		System.out.println(12);
		System.out.println(012); //octal decimal
		System.out.println(0x12); //hexa decimal
		System.out.println(0b11); //binary decimal
		System.out.println(012 + 013); //21
		
		System.out.println(true);
		System.out.println(12.0);
		
		System.out.println("Hexa Decimal Value of 65 = " + Integer.toHexString(65));
		
		System.out.println('A');
		System.out.println((char)65); //explicit type_casting
		System.out.println('\u0041');
		System.out.println('\u0905');
		System.out.println('\u0c05');
		System.out.println('\u0d05');
	}

}
