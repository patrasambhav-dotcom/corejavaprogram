import java.util.Scanner;
class Moduleoperator
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		System.out.println("enter a number");
		double b=sc.nextDouble();
		double real1=a/b;
		double real2=a/10;
		double real3=b/10;
		double real4=a%b;
		double real5=a%0;
		double real6=b/0;
		System.out.println("n1/n2 =" +real1);
		System.out.println("n1/10 =" +real2);
		System.out.println("n2/10 =" +real3);
		System.out.println("n1%n2 =" +real4);
		System.out.println("n1%0 ="  +real5);
		System.out.println("n2/0 ="  +real6);  

	}
}