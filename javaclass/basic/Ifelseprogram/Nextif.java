import java.util.*;
class Nextif
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double no1=sc.nextDouble();
		if(no1<0)
			no1=-no1;
		if(no1>9)
	    
		{
			if(no1<100)
			{
				System.out.println("two digit number");
			}
		}
	}
}