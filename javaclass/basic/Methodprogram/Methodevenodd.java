import java.util.*;
class Methodevenodd
{
	static void evenodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an interger");
		int no=sc.nextInt();
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
		evenodd();
	}
}