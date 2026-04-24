import java.util.*;
class Useaddintofmulti
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sc.nextInt();
		System.out.println("enter a number to multiply");
		int j=sc.nextInt();
		int s=0;
		while(i>0)
		{
			s=s+j;
			i--;
		}
		System.out.println("mutiple of two numbers without multi is =  " +s);


	}
}