class Finalexcep
{
	public static void main(String arg[])
	{
	 
	   try 
	   {
	   	 System.out.println(10/0);
	   }
	   catch(Exception e)
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