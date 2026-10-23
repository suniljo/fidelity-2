class Except2 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int result = x / y;

		System.out.printf("%d / %d = %d", x, y, result);
	}
}
