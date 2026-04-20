import java.util.*;
class Nodigitcheck
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		double no=sc.nextDouble();
		if(no<0)
		{
			no=-no;
		}
		if(no<10)
		{
			System.out.println(" single digit");
		}
		else if(no<100)
		{
			System.out.println("double digit");

		}
		else if(no<1000)
		{
			System.out.println("triple digit");
		}
		else
		System.out.println(" more than 3 digits");

		
	}
}