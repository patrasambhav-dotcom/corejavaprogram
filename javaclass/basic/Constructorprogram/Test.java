class Test
{
	
	Test()
	{
	     System.out.println("zero argument constructor");
	}
	Test(int x,int y)
	{
	      this();
	     System.out.println("para constructor");
	}
	public static void main(String arg[])
	{
	    Test t=new Test(10,20); 
	}
}