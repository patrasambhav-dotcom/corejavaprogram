class Excep2
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	  if(true)
	   	  {
	   	  	return ;
	   	  }
	   	 System.out.println(10/0);
	   	 
	   }
	   catch(ArithmeticException e)
	   {
	   	 System.out.println("exception caught "+e);
	   }
	   finally
	   {
	   	  System.out.println("must execute");
	   }
	   
	   System.out.println("program end");
	}
}