import java.util.*;
class Increment
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
	}
}