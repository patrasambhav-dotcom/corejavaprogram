


class Excep1  
{
    
	public static void main(String arg[]) 
	{
		 System.out.println("A");
		 try 
		 {
		 	   System.out.println(10/0);
		 	   System.out.println("try end");
		 }
		 catch(ArithmeticException e)
		 {
		 	   System.out.println("exception handle  d never zero");
		 }
		 System.out.println("B");
		 System.out.println("main end");
	}
}