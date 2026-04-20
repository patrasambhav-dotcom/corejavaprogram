import java.util.*;
class Seventeen
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter priniple amount");
		double p=sc.nextDouble();
		System.out.println("enter rate");
		double r=sc.nextDouble();
		System.out.println("enter time");
		double t=sc.nextDouble();
		double s=(p*r*t)/100;
		System.out.println("simple intrest ="+s);
	}
}