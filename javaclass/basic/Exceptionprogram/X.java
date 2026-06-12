class X 
{
	 static 
	 {
	 	System.out.println("static block x");
	 }
}
class Test
{
	public static void main(String[] args)throws 
	ClassNotFoundException
	{
	    Class.forName("Y");
	}
}