import java.util.*;
class Bignumber2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		double no1=sc.nextDouble();
		System.out.println("enter second no");
		double no2=sc.nextDouble();
		System.out.println("enter third no");
		double no3=sc.nextDouble();
		if(no1>no2)
		{
			System.out.println(" no1 is greater than no2");
		}
		else 
		{
			System.out.println("no2 is greater than no1");
		}
		if(no2>no3) 
		{
			System.out.println("no2 is greter than no3");

		}
		else 
		{
			System.out.println("no3 is greater than no2");
		}
		if(no1>no3)
		{
			System.out.println("no1 is greater than no3");
		}
		else 
		{
			System.out.println("no3 is greater than no1");
		}

		
	}
}