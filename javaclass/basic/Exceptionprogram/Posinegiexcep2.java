import java.util.Scanner;
class NegativeNumberException extends RuntimeException
{
	NegativeNumberException(String s)
	{
		super(s);
	}

}
class Posinegiexcep2 
{
	static void check(int no)
	{
		if(no>0)
		{
			System.out.println("+ve");
		}
		else
		{
			throw new NegativeNumberException("negative number");
		}
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("enter an integer");
		no=sc.nextInt();
		try 
		{
			check(no);
		}
		catch(NegativeNumberException e)
		{
			System.out.println(e);
		}
		System.out.println("main end");

	}
}