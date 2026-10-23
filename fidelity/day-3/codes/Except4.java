class Except4 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int result = x / y;

		System.out.printf("%d / %d = %d\n", x, y, result);
	  }catch(ArithmeticException ex){
		  System.out.println("cannot divide an integer by 0");
	  }catch(ArrayIndexOutOfBoundsException ex){
		  System.out.println("please provide min 2 cmd args");
	  }catch(NumberFormatException ex){
		  System.out.println("provide only int type data as cmd args");
	  }
	  System.out.println("---- DONE ----");
	}
}
