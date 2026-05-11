class This
{
	
	This()
	{
	      this(10,20);
	     System.out.println("zero argument constructor");
	}
	This(int x,int y)
	{
	     
	     System.out.println("para constructor");
	}
	public static void main(String arg[])
	{
	    This t=new This(); 
	}
}