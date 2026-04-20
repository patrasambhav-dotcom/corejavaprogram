import java.util.*;
class Syn3ifelse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double no1=sc.nextDouble();
		if(no1==0)
		{
			System.out.println("zero");
		}
		else 
		{
			if(no1>0)
			{
				System.out.println("positive");
			}
			else 
			{
				System.out.println("negative");
			}
		}
	}
}