import java.util.*;
class Increment3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		double b=++a +  ++a +  ++a;
		double c=a++ +  a++ +  a++;
		System.out.println(a+"  "+b+" "+c);
	}
}