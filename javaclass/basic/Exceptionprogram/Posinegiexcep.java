import java.util.Scanner;
class NegativeNumberException extends RuntimeException
{
	NegativeNumberException(String s)
	{
	  super(s);
	}
}

class Posinegiexcep
{
	static void check(int no)
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
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no ");
	int no=sc.nextInt();
	check(no);
     System.out.println("main end ");
	}

}