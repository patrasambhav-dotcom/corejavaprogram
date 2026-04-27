import java.util.Scanner;
class Methodsimpleint
{
	static void simpleint()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		double p=sc.nextDouble();
		System.out.println("enter rate ");
		double r=sc.nextDouble();
		System.out.println("Enter time");
		double t=sc.nextDouble();
		double si=p*r*t*0.01;
		System.out.println("simple intrest = " +si);


	}
	public static void main(String arg[])
	{
		simpleint();
	}
}