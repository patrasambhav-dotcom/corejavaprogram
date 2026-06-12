class Excep4 
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
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}


	}
}