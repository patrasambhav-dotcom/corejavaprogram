import java.util.*;
class Methodevenoddwitharg
{
	static void evenodd(int no)
	{
		
		if(no<0)
		{
			no=-no;
		}
		if(no%2==0)
		{
			System.out.println("even number");
		}
		else 
		{
			System.out.println("odd number");
		}
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int no=sc.nextInt();
		evenodd(no);
	}
}