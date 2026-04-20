import java.util.Scanner;
class Ortrueorfalse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		System.out.println("enter a number");
		double b=sc.nextDouble();
		System.out.println(++a>2 || ++b>2);
		System.out.println(a+"   "+b);
	}
}