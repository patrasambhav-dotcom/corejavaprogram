class Excep3 
{
	public static void main(String arg[])
	{
		try 
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}


	}
}