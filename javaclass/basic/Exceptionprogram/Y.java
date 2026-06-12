class X 
{
	 static
	{
		System.out.println("static block x");

	}
}
class Y 
{
	static void show()throws ClassNotFoundException
	{
		Class.forName("Z");
	}
	public static    void main(String arg[])
	{
		try 
		{
			show();
		}
		catch (Exception e)
		{
			System.out.println("exception caught"+e);
		}

	}
}