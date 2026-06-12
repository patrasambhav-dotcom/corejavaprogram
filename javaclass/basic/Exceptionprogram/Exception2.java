class Exception2
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
			System.out.println("exception handle d");
		}
		System.out.println("B");
		System.out.println("main end");
		
	}
}