import java.util.*;
class Inccharecter
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int a=sc.nextInt();
		System.out.println("enter a number");
		double b=sc.nextDouble();
		System.out.println("enter a letter");
		char ch=sc.next().charAt(0);
		++a;
		++b;
		++ch;

		
		System.out.println(a+"   "+b+"   "+ch);
	}
}