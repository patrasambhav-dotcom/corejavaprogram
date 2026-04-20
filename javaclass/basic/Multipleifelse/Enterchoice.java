import java.util.*;
class Enterchoice
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter two numbers");
		double no1=sc.nextDouble();
		double no2=sc.nextDouble();
		System.out.println("enter your choic\1.add \2.sub \3.mult");
		double ch=sc.nextDouble();
		if(ch==1)
		{
			System.out.println("Sum =  " +(no1+no2));
		}
		else if(ch==2)
		{
			System.out.println(" sub =  " +(no1-no2));
		}
		else if(ch==3)
		{
			System.out.println("mult =  "+(no1*no2));
		}
		else 
		{
			System.out.println(" invalid choice");
		}
	}
}