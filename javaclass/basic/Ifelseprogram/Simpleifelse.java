import java.util.*;
class Simpleifelse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double no1=sc.nextDouble();
		if(no1>0)
		{
			System.out.println("+ve number");
		}
		else 
		{
			System.out.println("-ve number");
		}
	}
}