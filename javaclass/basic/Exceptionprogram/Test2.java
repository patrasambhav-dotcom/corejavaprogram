import java.util.Scanner;
class NegativeNumberException extends RuntimeException
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Test2
{
	static void check(int no)throws NegativeNumberException
	{
	     if(no>0)
	     {
	       System.out.println("+ve ");
	     }
	     else
	     {
	        throw new NegativeNumberException("negative number");
	     }
	}
	public static void main(String arg[])throws NegativeNumberException
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();

		check(no);
	
	
	
	
     System.out.println("main end ");
	}

}
