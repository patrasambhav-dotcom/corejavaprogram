import java.util.Scanner;
class Methodsimpleintwitharg
{
	static void simpleint(double p,double r,double t)
	{
		
		double si=p*r*t*0.01;
		System.out.println("simple intrest = " +si);


	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		double p=sc.nextDouble();
		System.out.println("enter rate ");
		double r=sc.nextDouble();
		System.out.println("Enter time");
		double t=sc.nextDouble();
		simpleint(p,r,t);
	}
}