class Doubleexcep 
{
	public static void main(String arg[])
	{
		int arr[]={10,8,9};
		try 
		{
			System.out.println(arr[0]/2);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("exception 1 caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("exception 2 caught");
		}
		System.out.println("program end");

	}
}