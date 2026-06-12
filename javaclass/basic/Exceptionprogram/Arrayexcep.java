class Arrayexcep
{
	public static void main(String arg[])
	{
		int arr[]={10,9,8};
		try 
		{
			System.out.println(arr[4]);
		}	
		catch(ArrayIndexOutOfBoundsException e)	
	    {
	    	System.out.println(e);
	    	System.out.println("exception caught");
	    }
	    System.out.println("program end");
		
	}
}