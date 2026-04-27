import java.util.Scanner;
class Methodsimpleintwithreturn
{
	static double simpleint()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		double p=sc.nextDouble();
		System.out.println("enter rate ");
		double r=sc.nextDouble();
		System.out.println("Enter time");
		double t=sc.nextDouble();
		double si=p*r*t*0.01;
		return si;


	}
	public static void main(String arg[])
	{
		double res=simpleint();
		System.out.println("Simple intrest = " +res);
	}
}