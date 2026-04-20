import java.util.*;
class Ifmutiple
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double no=sc.nextDouble();
		if(no>0)
		{
			System.out.println("+ve number");
		}
		if(no<0)
		{
			System.out.println(" -ve number");
		}
		if(no==0)
		{
			System.out.println(" zero ");
		}

	}
}