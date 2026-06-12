class Exception3
{
	public static void main(String aeg[])
	{
		System.out.println("A");
		try 
		{
			System.out.println(10/0);
			System.out.println("try end");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("exception caught");
		}
		
		System.out.println("program end");
		
	}
}