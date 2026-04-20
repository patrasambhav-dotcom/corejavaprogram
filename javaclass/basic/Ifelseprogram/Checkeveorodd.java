import java.util.*;
class Checkeveorodd
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number");
		double no1=sc.nextDouble();
		if(no1%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");

		}
	}
}