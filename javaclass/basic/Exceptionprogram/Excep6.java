class Excep6 
{
	public static void main(String arg[])
	{
		 try 
		 {
		 	System.out.println("try block executed");
		 	
		 }
		 catch(ArithmeticException e) 
		 {
		 	System.out.println("catch block executed");
		 }
		 finally 
		 {
		 	System.out.println("finally block executed");
		 }
	}
}