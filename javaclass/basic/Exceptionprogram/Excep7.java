class Excep7 
{
	public static void main(String arg[])
	{ 
		
			System.out.println(Methodone());	
	}
	public static int Methodone()
		{
			try 
			{
				System.out.println(10/0);
				return 777;
			}
			catch (ArithmeticException e)
			{
				return 888;

			}
			finally 
			{
				return 999;
			}
		}
}