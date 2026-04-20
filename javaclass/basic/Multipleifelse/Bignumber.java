import java.util.*;
class Bignumber
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		double no1=sc.nextDouble();
		System.out.println("enter second no");
		double no2=sc.nextDouble();
		if(no1>no2)
		{
			System.out.println(" no1 is greater than no2");
		}
		else 
		{
			System.out.println("no2 is greater than no1");
		}
	}
}