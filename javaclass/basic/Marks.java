import java.util.*;
class Marks
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mark 1");
		double a=sc.nextDouble();
		System.out.println("enter mark 2");
		double b=sc.nextDouble();
		System.out.println("enter mark 3");
		double c=sc.nextDouble();
		double s=a+b+c;
		double v=(a+b+c)/3;
		System.out.println("mark1 = "+a);
		System.out.println("mark2 = "+b);
		System.out.println("mark3 = "+c);
		System.out.println("total marks = "+s);
		System.out.println("average marks = "+v);
	}
}