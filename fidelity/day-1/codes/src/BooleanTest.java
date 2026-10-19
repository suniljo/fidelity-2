
public class BooleanTest {
	boolean status;
	
	public static void main(String[] args) {
		boolean result;
		//result = 10 > 20;
		result = 100 > 20;
		System.out.println(result);
		
		//default value of boolean is false
		BooleanTest blObj = new BooleanTest();
		System.out.println(blObj.status);
	}

}
