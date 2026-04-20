import java.util.*;
class Noswapping
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		System.out.println("enter a number");
		double b=sc.nextDouble(); 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"   "+b);
	}
}