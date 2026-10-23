class Except5 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int result = x / y;

		System.out.printf("%d / %d = %d\n", x, y, result);
	  }
	  catch(Exception ex){
		  System.out.println("### an exception occured ###");
		  System.out.println("message = " + ex.getMessage());
		  System.out.println();
		  System.out.println("toString() = " + ex.toString());
		  System.out.println();
		  ex.printStackTrace();
	  }
	  System.out.println("---- DONE ----");
	}
}
