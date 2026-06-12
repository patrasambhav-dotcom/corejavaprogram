class Excep8 
{
	public static void main(String arg[])
	{
		try 
		{
			System.out.println("try");
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("catch block executed ");
		}
		finally 
		{
			System.out.println("final block caught");
		}
	}
}